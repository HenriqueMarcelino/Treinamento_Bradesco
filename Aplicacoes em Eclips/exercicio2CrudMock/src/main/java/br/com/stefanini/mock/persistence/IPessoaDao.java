package br.com.stefanini.mock.persistence;

import java.util.List;

import br.com.stefanini.mock.entity.Pessoa;

public interface IPessoaDao {
	
	public List<Pessoa>findAllPessoa(String nome) throws Exception;

	public Pessoa findById(Integer id) throws Exception;
	
	public String createdPessoa(Pessoa pessoa) throws Exception;
	
	public String updatePessoa(Pessoa pessoa) throws Exception;
	
	public String deletePessoa(Integer id) throws Exception;

}
