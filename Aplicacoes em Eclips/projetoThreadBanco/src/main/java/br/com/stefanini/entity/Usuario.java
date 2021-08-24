package br.com.stefanini.entity;

import org.jcommon.encryption.SimpleMD5;

public class Usuario {

	private Integer idUsuario;
	private String nome;
	private String email;
	private String uuid;
	private java.util.Date dataCadastro;
	private String senha;

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", uuid=" + uuid
				+ ", dataCadastro=" + dataCadastro + "]";
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
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

	public void gerarSenha() {
		// ENGANANDO A SENHA
		// MD5 32 CARACTERES ... PROGRAMA
		// SALT ENBARALHAR
		String chave = "www.stefanini.com.br.henrique@gmail.com;1=1=1+1=3;";
		SimpleMD5 md5 = new SimpleMD5(this.getSenha(), chave);
		String chave2 = "www.stefanini.com.br.henrique@gmail.com;1=1=1+1=3;";
		SimpleMD5 md52 = new SimpleMD5("obrigado", chave);
		String senha = md5.toHexString() + md52.toHexString(); // 32 JAMAIS ...(MD5) CRIPTOGRAFAR

	}

	public static void main(String[] args) {
		Usuario u = new Usuario();
		u.setNome("henrique");
		u.setSenha("123456");
		u.getSenha();
		System.out.println(u.getSenha());
		System.out.println(u.getSenha().length());
	}

}
