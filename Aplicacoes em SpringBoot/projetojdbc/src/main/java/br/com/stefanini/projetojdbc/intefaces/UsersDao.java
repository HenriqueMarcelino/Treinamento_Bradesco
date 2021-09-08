package br.com.stefanini.projetojdbc.intefaces;

import java.util.List;

import br.com.stefanini.projetojdbc.entity.Users;

public interface UsersDao {
	
	public int save(Users user);
	public int update(Users user);
	public int delete(int id);
	public List<Users> findAll();
	public Users findById(Integer code);

}
