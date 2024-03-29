package br.com.stefanini.projetobd.persistence;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.projetoCorrentista.model.Usuario;

public class UsuarioDao extends Dao {

	public void createUsuario(Usuario usuario) throws Exception {

		open();

		stmt = con.prepareStatement("insert into usuario values(null,?,?)");
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setInt(3, usuario.getIdUsuario());
		stmt.execute();
		stmt.close();

		close();

	}

	public Integer createUsuarioTransacaoReturn(Usuario usuario) throws Exception {

		open();

		con.setAutoCommit(false);
		int chave = 0;
		try {
			stmt = con.prepareStatement("insert into usuario values(null,?,?)",
					PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setInt(3, usuario.getIdUsuario());
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			rs.next();

			chave = rs.getInt(1);
			stmt.close();

			stmt1 = con.prepareStatement("insert into transacao values(null,?,?,?)");
			stmt1.setDouble(1, usuario.getTransacao().getValor());
			stmt1.setString(2, usuario.getTransacao().getProduto());
			stmt1.setString(3, usuario.getTransacao().getDescricao());
			stmt1.setInt(4, chave);
			stmt1.executeUpdate();
			stmt1.close();

			close();
			con.setAutoCommit(true);
			con.commit();
		} catch (Exception ex) {
			con.rollback();
			throw new Exception(ex.getMessage());
		} finally {
			con.close();
		}
		return chave;
	}

	public List<Usuario> findAll() throws Exception {
		open();
		List<Usuario> lista = new ArrayList<Usuario>();
		stmt = con.prepareStatement("select * from usuario");
		rs = stmt.executeQuery();
		while (rs.next()) {
			Usuario usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3));
			lista.add(usuario);
		}
		close();
		return lista;
	}
	
	public static void main(String[] args) {
		UsuarioDao dao = new UsuarioDao();

		try {

			for (Usuario usuario : dao.findAll())
				
			System.out.println(usuario);

		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

}
