package br.com.stefanini.persistence;

import java.util.List;

import br.com.stefanini.dto.ProdutoDto;

public interface IProdutoDao {
	
	public List<ProdutoDto> findAll() throws Exception;

}
