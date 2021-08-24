package br.com.stefanini.projetostruts.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

import br.com.stefanini.projetostruts.entity.Pessoa;
import br.com.stefanini.projetostruts.io.IPessoaFile;
import br.com.stefanini.projetostruts.io.PessoaFile;

public class PessoaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Pessoa pessoa;
	HttpServletRequest request;

	public void init() {
		request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	}

	public PessoaAction() {
		pessoa = new Pessoa();
	}

	public String execute() {
		if (this.pessoa.getNome().equals("belem") && this.pessoa.getIdade() > 18) {
			return "success";
		} else {
			return "error";
		}
	}

	public String gravar() {
		this.init();
		PessoaValida valida = new PessoaValida();
		try {

			IPessoaFile arq = new PessoaFile();
			arq.open();
			valida.validarNome(this.pessoa.getNome());
			valida.validarIdade(this.pessoa.getIdade());

			arq.write(this.pessoa);
			arq.close();
			request.setAttribute("msg", "Dados Gravados");
			return "success";
		} catch (Exception ex) {
			request.setAttribute("msg", "Error na Gravacao ..." + ex.getMessage());
			return "error";
		}
	}

	public String lerArquivo() {
		this.init();

		try {
			IPessoaFile arq = new PessoaFile();
			List<Pessoa> resposta = arq.read();
			request.setAttribute("lista", resposta);
			return "success";
		} catch (Exception ex) {
			request.setAttribute("msg", "Error de leitura ..." + ex.getMessage());
			return "error";
		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
