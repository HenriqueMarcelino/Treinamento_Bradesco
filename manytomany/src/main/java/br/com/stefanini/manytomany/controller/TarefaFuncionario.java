package br.com.stefanini.manytomany.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.manytomany.entity.Funcionario;
import br.com.stefanini.manytomany.entity.Tarefa;
import br.com.stefanini.manytomany.persistence.FuncionarioDao;
import br.com.stefanini.manytomany.persistence.TarefaDao;

@WebServlet("/TarefaFuncionario")
public class TarefaFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TarefaFuncionario() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter(flag) != null) {
			if (request.getParameter("flag").equals("add")) {
				ManagerBeanFuncionario.Lst.add(
						new Funcionario(Integer.parseInt(request.getParament("code")),
								request.getParament("nome")));

				request.setAttribute("lista", ManagerBeanFuncionario.lst);
				request.getRequestDispacher("saidatres.jsp").forward(request, response);

			}
		} else {
			request.setAttribute("lista", ManagerBeanFuncionario.lst);
			request.getRequestDispacher("saidatres.jsp").forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Integer code = new Integer(request.getParamenter("code")); // Paramenter

			response.getWhiter().print("um" + code);

			Funcionario existe = new FuncionarioDao().findByCode(code);
			HttpSession session = request.getSession(true);
			if (existe != null) {

				List<Funcionario> listaf = new FuncionarioDao().findSelectAllFuncionario();
				List<Tarefa> listat = new TarefaDao().findSelectAllTarefa();

				session.setAttribuite("listaf", listaf);
				session.setAttribuite("listat", listat);
				response.sendRedirect("responta.jsp");
			} else {
				session.setAttribute("invalido", "erro do usuario ...");
				response.sendRedirect("responta.jsp");
			}

		} catch (Exception ex) {

		}

		doGet(request, response);
	}

}
