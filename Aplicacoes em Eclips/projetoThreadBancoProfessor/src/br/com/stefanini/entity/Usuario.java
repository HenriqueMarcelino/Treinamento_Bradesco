package br.com.stefanini.entity;

import java.util.Date;
import java.util.UUID;
import org.jcommon.encryption.SimpleMD5;

public class Usuario {

	private Integer idUsuario;
	private String nome;
	private String email;
	private String uuid;
	private  java.util.Date  dataCadastro;
	private String  senha;
	
	{
		this.dataCadastro = new Date();
		this.uuid = UUID.randomUUID().toString();
	}
	
	public Usuario() {
	 
	}
	
	

	public Usuario(Integer idUsuario, String nome, String email, String uuid, Date dataCadastro, String senha) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.uuid = uuid;
		this.dataCadastro = dataCadastro;
		this.senha = senha;
	}

 

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", uuid=" + uuid
				+ ", dataCadastro=" + dataCadastro + "]";
	}



	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public java.util.Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(java.util.Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public void  gerarSenha() {
	 String chave = "www.stefanini.com.br.profedsonbelemg@gmail.Com;1=1=1+1=3;";
		SimpleMD5 md5 =new SimpleMD5(this.getSenha(),chave);
		 String chave2 = "www.stefanini.com.br.profedsonbelemg@gmail.Com;1=1=1+1=3;";
		 SimpleMD5 md52 =new SimpleMD5("obrigado",chave2);	
		 String senha = md5.toHexString()  + md52.toHexString();
		 setSenha(senha);
	}
	
	public static void main(String[] args) {
		//MD5 32 CARACTERES ... (PROGRAMA)
		//salt enbaralhar
        Usuario u = new Usuario();
          u.setNome("belem");
          u.setSenha("123456");
          u.gerarSenha();
		System.out.println(u.getSenha());
		System.out.println(u.getSenha().length()); //32 jamais ... (md5) ... criptografia 
	//512
	}
	
	
	
}
