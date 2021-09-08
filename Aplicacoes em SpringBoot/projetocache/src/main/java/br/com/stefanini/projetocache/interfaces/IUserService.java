package br.com.stefanini.projetocache.interfaces;

import br.com.stefanini.projetocache.entity.Users;

public interface IUserService {
	
	public Users saveOrUpdate(Users user);
	
	public String enviarEmail(Users u);

}
