package br.com.stefanini.projetorel.persistence;

import br.com.stefanini.projetorel.dto.response.VendedorResponse;

public class VendedorDao extends Dao {
	
	public VendedorResponse findByCode(int code) throws Exeception{
		open();
		stmt = con.prepareStatement("");
		
		stmt.setInt(1, code);
		rs = stmt.executeQuery();
		VendedorResponse vendedordto = null;
		if(rs.next()) {
			vendedordto = new VendedorResponse();
			vendedordto.setIdVendedor(rs.getInt(1));
			vendedordto.setNome(rs.getString(2));
			vendedordto.setEmail(rs.getString(3));
			vendedordto.setSenha(rs.getString(4));
			vendedordto.setPerfil(rs.getString(5));
		}
		
		close();
		return vendedordto;
	}

		public static void main(String[] args) {
			try {
				
				VendedorResponse dto = new VendedorDao().findByCode(100);
				System.out.println(dto);
			
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
}
