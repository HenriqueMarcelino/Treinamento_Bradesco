package br.com.stefanini.projetostruts.service;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;

import br.com.stefanini.projetostruts.entity.Pessoa;

@Path("/rs")
public class PessoaService {
	
	static List<Pessoa> pessoas= new ArrayList<Pessoa>();
	
	@GET
	@Path("/pessoas")
	@Produces(MediaType.APPLICATION_JSON)
	public String getFindAllPessoa() {
		pessoas.add(new pessoa(1, "Belem",48));
		pessoas.add(new pessoa(2, "Thiago",28));
		pessoas.add(new pessoa(3, "Danilo",48));	
		return new Gson().toJson(pessoas);
		
	}
	
	@POST
	@Path("/pessoa")
	@Produces(MediaType.APLICATION_JSON)
	@Consumes(MediaType.APLICATION_JSON)
	public String saveMock(Pessoa p) {
		pessoa.add(p);
		return new Gson().toJson(pessoas);
	}
	
/*
 * 
 *  1 Alterou o web xml, inserindo as configurações do service
	2 inseriu o jar
	3 criei o pacote service e adicionei a configuração no web.xml
	
	<servlet>
		<servlet-name>Jersey REST Service</servlet-name>
		<servlet-class>com.sun.jersey.spi.container.servlet.Container</servlet-class>
		<init-param>
			<param-name>com.sun.jersey.config.property.packeges</param-name>
			<param-value>br.com.stefanini.projetostruts.service</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>

 * 	
 *  4 instalei o programa Postman para realizar os teste de serviços
 *  5 Mudei a minha anotação da Classe 
 *  
 *  package br.com.stefanini.projetostruts.entity;

import java.io.Serializable;

@XmlRootElement
public class Pessoa implements Serializable{
	
	//Tudo que sair pode ser xml ou pode ser JSON (Rest)

	private Integer idPessoa;
	private String  nome;
	private Integer idade;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer idPessoa, String nome, Integer idade) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + 
				", idade=" + idade + "]";
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}





 *  6 Anotei a minha classe serviço para utilizar o Jersey
 *  
 *  @Path("/rs")
public class PessoaService {
	
	static List<Pessoa> pessoas= new ArrayList<Pessoa>();
	
	@GET
	@Path("/pessoas")
	@Produces(MediaType.APPLICATION_JSON)
	public String getFindAllPessoa() {
		pessoas.add(new pessoa(1, "Belem",48));
		pessoas.add(new pessoa(2, "Thiago",28));
		pessoas.add(new pessoa(3, "Danilo",48));	
		return new Gson().toJson(pessoas);
		
	}
	
	@POST
	@Path("/pessoa")
	@Produces(MediaType.APLICATION_JSON)
	@Consumes(MediaType.APLICATION_JSON)
	public String saveMock(Pessoa p) {
		pessoa.add(p);
		return new Gson().toJson(pessoas);
	}
	
 */
	
	
		

}
