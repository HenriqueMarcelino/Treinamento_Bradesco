package br.com.stefanini.projetobd.persistence;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.projetobd.model.Usuario;

public class UsuarioDao extends Dao {

	// Este metodo ele cria o Usuario e n�o retorna a a chave de identifica��o.

	public void createUsuario(Usuario u) throws Exception {

		open();

		stmt = con.prepareStatement("insert into usuario values(null,?,?,?,?)");
		stmt.setString(1, u.getNome());
		stmt.setString(2, u.getEmail());
		stmt.setString(3, u.getSenha());
		stmt.setString(4, u.getUuid());
		stmt.execute(); // Esse comando n�o pode ser esquecido se n�o ele n�o executa e n�o grava na
						// tabela.
		stmt.close();

		close();

	}

	// Este metodo ele criar e retorna a chave de identifica��o do Usuario.
	
	
	// Aqui j� esta sendo gravado Usuario e Endere�o relacionado.

	public Integer createUsuarioEnderecoReturn(Usuario u) throws Exception {

		open();

		con.setAutoCommit(false);
		int chave = 0;
		try {
			stmt = con.prepareStatement("insert into usuario values(null,?,?,?,?)",
					PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, u.getNome());
			stmt.setString(2, u.getEmail());
			stmt.setString(3, u.getSenha());
			stmt.setString(4, u.getUuid());
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			rs.next(); // Para dar continuidade ao processo se n�o ele n�o retorna o resultado, o
						// comando esta pedindo para dar continuidade.

			chave = rs.getInt(1);
			stmt.close();

			stmt1 = con.prepareStatement("insert into endereco values(null,?,?,?)");
			stmt1.setString(1, u.getEndereco().getBairro());
			stmt1.setString(2, u.getEndereco().getCidade());
			stmt1.setInt(3, chave);
			stmt1.executeUpdate();
			stmt1.close();

			close();
			con.setAutoCommit(true);
			con.commit(); // Grava tudo
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
			Usuario u = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			lista.add(u);
		}
		close();
		return lista;
	}

	public static void main(String[] args) {
		UsuarioDao dao = new UsuarioDao();
//		Usuario usu = new Usuario(null, "Rick", "Rick@gmail.com", "123456", UUID.randomUUID().toString());
//		Endereco e = new Endereco (null,"Diadema","S�o Paulo");
//			usu.setEndereco(e);

		try {
//			usu.gerarCriptografia();
//			int chave = dao.createUsuarioEnderecoReturn(usu);
//			System.out.println("Dados Gravados" + chave);

			for (Usuario u : dao.findAll())
				
			System.out.println(u);

		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

}
