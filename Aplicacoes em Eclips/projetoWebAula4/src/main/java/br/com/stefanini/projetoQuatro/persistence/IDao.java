package br.com.stefanini.projetoQuatro.persistence;

public interface IDao {
	
	public void open() throws Exception;
	
	public void close() throws Exception;
}
