package br.com.stefanini.projetobd.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;

public class Usuario {

	private Integer idUsuario;
	private String nome;
	private String email;
	private String senha;
	private String uuid;

	private Endereco endereco;

	public Usuario() {

	}

	public Usuario(Integer idUsuario, String nome, String email, String senha, String uuid) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.uuid = uuid;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void gerarCriptografia() throws Exception {
		;
		String chave = "henrique@gmail.com;www.henrique.com.@=1+1;*123+;";
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		this.setSenha(this.getSenha() + chave);
		byte[] messageDigest = md5.digest(this.senha.getBytes());
		BigInteger no = new BigInteger(1, messageDigest);
		String hashText = no.toString(16);
		while (hashText.length() < 32) {
			hashText = "0" + hashText;
		}
		this.setSenha(hashText);
	}

	public static void main(String[] args) {

		try {
			Usuario u = new Usuario(10, "Henrique","henrique@gmail.com","1234",
					UUID.randomUUID().toString());
			u.gerarCriptografia();
			System.out.print(u);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
