	package br.com.stefanini.projetostruts.io;
	
	import java.util.List;

import br.com.stefanini.projetostruts.entity.Pessoa;
	
	public interface IPessoaFile {
	  
		  public void open() throws Exception;
		  
		  public void close() throws Exception;
		  
		  public void write (Pessoa p) throws Exception;
		  
		  public List<Pessoa> read() throws Exception;
		  
	}
