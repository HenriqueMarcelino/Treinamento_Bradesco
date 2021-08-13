package br.com.stefanini.projetorel.persistence;

import br.com.stefanini.projetorel.entity.Cliente;

public class ClienteDao extends Dao{
	
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
		}
		
		close();
		return cliente;
	}

}
