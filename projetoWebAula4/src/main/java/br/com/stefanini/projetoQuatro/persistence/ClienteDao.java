package br.com.stefanini.projetoQuatro.persistence;

import com.mysql.jdbc.PreparedStatement;

import br.com.stefanini.projetoQuatro.dto.request.RequestCliente;
import br.com.stefanini.projetoQuatro.model.Cliente;

public class ClienteDao extends Dao implements IClienteDao {

	@Override
	public Cliente findByCode(int code) throws Exception {
		open();
		stmt = con.prepareStatement("select * from cliente where id is null");
		stmt.setInt(1,code);
		rs = stmt.executeQuery();
		Cliente cliente = null;
		if(rs.next()) {
			cliente = new Cliente();
				cliente.setId(rs.getInt(1));
				cliente.setNome(rs.getString(2));
				cliente.setEmail(rs.getString(3));
				cliente.setSenha(rs.getString(4));
				cliente.setDataCriacao(rs.getDate(5));
		}
		
		close();
		return cliente;
	}
	
	// Esse metodo esta na interface 
	public Integer createClienteTelefone(RequestCliente c) throws Exception {
		open();
		Integer chave =0;
		con.setAutoCommit(false);
		
		try {
			
			stmt = con.prepareStatement("insert into cliente values (null,?,?,md5(?),?",
					   PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, c.getCliente().getNome());
			stmt.setString(2, c.getCliente().getEmail());
			stmt.setString(3, c.getCliente().getSenha());
			java.sql.Date sqldate = new java.sql.Date(c.getCliente().getDataCriacao().getTime());
			stmt.setDate(4, sqldate);
			stmt.executeUpdate();	
			rs = stmt.getGeneratedKeys();
			rs.next();
			chave =rs.getInt(1);
			stmt.close();
			
			stmt1 = con.prepareStatement("insert into telefone values (null,?,?)");
			stmt1.setString(1,c.getCliente().getTelefones().get(0).getNumero());
			stmt1.setInt(2, chave);	
			stmt1.execute();
			stmt1.close();
			
			stmt1 = con.prepareStatement("insert into telefone values (null,?,?)");
			stmt1.setString(1,c.getCliente().getTelefones().get(1).getNumero());
			stmt1.setInt(2, chave);
			stmt1.execute();
			stmt1.close();
			
			con.setAutoCommit(true);
			
		}catch(Exception ex) {
				con.rollback();
			}
			finally {
				close();
			}
			return chave;
	}	

}
