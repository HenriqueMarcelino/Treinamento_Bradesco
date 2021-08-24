package br.com.stefanini.projetorel.persistence;

import br.com.stefanini.projetorel.dto.response.ClienteResponse;

public class ClienteDao extends Dao{
	
	public ClienteResponse findByCode(int code) throws Exception {
		open();
		stmt = con.prepareStatement("select u.id, u.nome, u.email, u.senha,"
									+ " c.perfil, c.status from usuario u left join "
									+ "cliente c from cliente c on "
									+ "c.id = c.idcliente and c.idCliente=?");
		stmt.setInt(1,code);
		rs = stmt.executeQuery();
		ClienteResponse clientedto = null;
		if(rs.next()) {
				clientedto = new ClienteResponse();
				clientedto.setIdCliente(rs.getInt(1));
				clientedto.setNome(rs.getString(2));
				clientedto.setEmail(rs.getString(3));
				clientedto.setSenha(rs.getString(4));
				clientedto.setPerfil(rs.getString(5));
				clientedto.setStatus(rs.getString(6));
				
		}
		
		close();
		return clientedto;
	}
	
	public static void main(String[] args) {
		try {
			
			ClienteResponse dto = new ClienteDao().findByCode(100);
			System.out.println(dto);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
