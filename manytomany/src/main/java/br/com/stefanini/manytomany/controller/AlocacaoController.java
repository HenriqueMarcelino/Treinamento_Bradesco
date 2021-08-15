package br.com.stefanini.manytomany.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlocacaoController
 */
@WebServlet("/AlocacaoController")
public class AlocacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		Integer idTarefa = Integer.parseInt (request.getParamenter("idTarefa"));
		Integer idFuncionario = Integer.parseInt (request.getParamenter("idFuncionario"));
		
		response.getWhite().print(idTarefa + "," + idFuncionario);

	}

}
