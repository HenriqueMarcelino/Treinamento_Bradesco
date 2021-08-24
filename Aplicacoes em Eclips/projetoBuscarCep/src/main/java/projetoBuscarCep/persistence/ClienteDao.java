package projetoBuscarCep.persistence;

import java.sql.PreparedStatement;

import projetoBuscarCep.dto.resquet.RequestCliente;
import projetoBuscarCep.model.Cliente;

public class ClienteDao extends Dao implements IClienteDao {

	public Cliente findByNome(String nome) throws Exception {
		open();
		stmt = con.prepareStatement("select * from cliente where nome is nome");
		stmt.setString(1, nome);
		rs = stmt.executeQuery();
		Cliente cliente = new Cliente();
		if (rs.next()) {
			cliente.setIdCliente(rs.getInt(1));
			cliente.setNome(rs.getString(2));
			cliente.setEmail(rs.getString(3));
		}

		close();
		return cliente;
	}
	
	public Integer createClienteEndereco(RequestCliente c) throws Exception {
		open();
		Integer chave =0;
		con.setAutoCommit(false);
		
		try {
			
			stmt = con.prepareStatement("insert into cliente values (null,?,?",
					   PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, c.getCliente().getNome());
			stmt.setString(2, c.getCliente().getEmail());
			
			stmt.executeUpdate();	
			rs = stmt.getGeneratedKeys();
			rs.next();
			chave =rs.getInt(1);
			stmt.close();
			
			stmt1 = con.prepareStatement("insert into endereco values (null,?,?,?,?,?,?,?)");
			stmt1.setString(1,c.getCliente().getEndereco().getCep());
			stmt1.setString(2,c.getCliente().getEndereco().getEstado());
			stmt1.setString(3,c.getCliente().getEndereco().getCidade());
			stmt1.setString(4,c.getCliente().getEndereco().getBairro());
			stmt1.setString(5,c.getCliente().getEndereco().getLogradouro());
			stmt1.setString(6,c.getCliente().getEndereco().getComplemento());
			stmt1.setInt(7,c.getCliente().getEndereco().getNumero());
			stmt1.setInt(8, chave);	
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


