package br.com.stefanini.login.persistence;

import br.com.stefanini.login.entity.Usuario;

public class UsuarioDao extends Dao implements IUsuarioDao {

	@Override
	public void gravar(Usuario usuario) throws Exception {
		 open();
		    usuario.gerarCriptografia();
		    usuario.setStatus("ativo");
		   stmt = con.prepareStatement("insert into usuario (nome,email,senha,status) values(?,?,?,?) ");
		   stmt.setString(1, usuario.getNome());
    	   stmt.setString(2, usuario.getEmail());
		   stmt.setString(3, usuario.getSenha());
		   stmt.setString(4,  usuario.getStatus());
			 stmt.execute();
		   stmt.close();	 
		 close();
	}

	@Override
	public Usuario logar(Usuario usuario) throws Exception {
		open();
	    usuario.gerarCriptografia();
 
	   stmt = con.prepareStatement("select * from usuario where email= ? and senha=? ");
	   stmt.setString(1, usuario.getEmail());
	   stmt.setString(2, usuario.getSenha());
  
		rs =  stmt.executeQuery();
		Usuario u = null;
		 if (rs.next()){
			   u = new Usuario();
			    u.setIdUsuario(rs.getInt(1));
			    u.setNome(rs.getString(2));
			    u.setUuid(rs.getString(3));
                u.setEmail(rs.getString(4));
                u.setSenha (rs.getString(5));
                u.setStatus(rs.getString(6));
		 }
		
	   stmt.close();	 
	 close();
		return u;
	}

}
