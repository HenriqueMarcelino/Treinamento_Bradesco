package br.com.stefanini.persistence;

import java.util.Date;

import br.com.stefanini.entity.Usuario;
 

public class UsuarioDao  extends Dao{

	
	public Usuario login(Usuario u) throws Exception{
 	   open();
		       u.gerarSenha();
		stmt = con.prepareStatement("select * from usuario where email=? and senha=? ");
		stmt.setString(1, u.getEmail()); 
		stmt.setString(2, u.getSenha());
		rs = stmt.executeQuery();
		Usuario usuario =null;
		if (rs.next()) {
			usuario = new Usuario();
		   usuario.setIdUsuario(rs.getInt(1));
		   usuario.setNome(rs.getString(2));
		   usuario.setEmail(rs.getString(3));
		   usuario.setUuid(rs.getString(4));
		   usuario.setSenha(rs.getString(5));
		   usuario.setDataCadastro(rs.getDate(6));
		}
    	close();
		return usuario;
	 }
	
	
	public String gravarUsuario(Usuario u)throws Exception{
		 open();
		 u.gerarSenha();
		    stmt = con.prepareCall("call gravar(?,?,?,?,?)");
		        stmt.setString(1,u.getNome());
		        stmt.setString(2, u.getEmail());
		        stmt.setString(3, u.getUuid());
		        stmt.setString(4, u.getSenha());
		        java.sql.Date sql = new java.sql.Date(u.getDataCadastro().getTime());
		        stmt.setDate(5, sql);
		    stmt.executeUpdate(); 
		
		  close();
		  return "dados gravados";
	}
	
	
	public static void main(String[] args) {
		 try {
			    Usuario u = new Usuario();
			    u.setEmail("belem@gmail.com");
			    u.setSenha("123456");
			    
			 Usuario resposta = new UsuarioDao().login(u);
			 
			 System.out.println(resposta);
			 
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }
		
		
	}
	
	
}
