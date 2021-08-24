package br.com.stefanini.projstrutsmaven.persistence;

import br.com.stefanini.projstrutsmaven.entity.Usuario;

public class UsuarioDao extends Dao{

	public Usuario findByLogin(Usuario u) throws Exception{
		open();
			stmt = con.prepareStatement
				("select * from usuario u where u.email=? and u.senha=?");
			stmt.setString(1, u.getEmail());
			stmt.setString(2, u.getSenha());
			rs = stmt.executeQuery();
			
			Usuario resp = null;
			if(rs.next()) {
				resp = new Usuario();
				resp.setIdUsuario(rs.getInt(1));
				resp.setEmail(rs.getString(2));
				resp.setSenha(rs.getString(3));
				resp.setPerfil(rs.getString(4));
			}
		close();
		return resp;
	}
	
	
	public void gravar(Usuario u) throws Exception{
		open();
		
		stmt = con.prepareStatement("insert into usuario values(null,?,?)");
		stmt.setString(1, u.getEmail());
		stmt.setString(2, u.getSenha());
		stmt.execute();
		stmt.close();
		close();
	}
	
}



/*
 * create table usuario(
 * idUsuario int primary key auto_increment,
 * nome varchar(50),
 * email varchar(100) unique
 * );
 * 
 * 
 */
