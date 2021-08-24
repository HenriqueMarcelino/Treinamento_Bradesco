package br.com.stefanini.mock.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.mock.entity.Pessoa;
import br.com.stefanini.mock.persistence.PessoaDao;

@WebServlet("/PessoaController")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PessoaController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			List<Pessoa> pessoa = new ArrayList<>();

			request.setAttribute("pessoa", pessoa);
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Pessoa pessoa = new Pessoa(request.getParameter("nome"),request.getParameter("telefone"));
		PessoaDao pessoaDao = new PessoaDao();
		
		try {
			pessoaDao.createdPessoa(pessoa);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
	
	protected void alterar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Pessoa pessoa = new Pessoa();
		PessoaDao pessoaDao = new PessoaDao();
		
		try {
			
			String id = request.getParameter("id");
			
			pessoa = pessoaDao.findById(Integer.parseInt(id));
			
			pessoa.setNome(request.getParameter("nome"));
			pessoa.setTelefone(request.getParameter("telefone"));
			
			pessoaDao.updatePessoa(pessoa);
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
