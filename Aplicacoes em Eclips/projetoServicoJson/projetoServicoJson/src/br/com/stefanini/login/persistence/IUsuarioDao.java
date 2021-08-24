package br.com.stefanini.login.persistence;

import br.com.stefanini.login.entity.Usuario;

public interface IUsuarioDao {

	 public void gravar(Usuario usuario) throws Exception;
	 public Usuario logar(Usuario usuario) throws Exception;
	 
}
