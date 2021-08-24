package projetoBuscarCep.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetoBuscarCep.dto.resquet.RequestCliente;
import projetoBuscarCep.model.Cliente;
import projetoBuscarCep.persistence.ClienteDao;
import projetoBuscarCep.persistence.IClienteDao;

@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String cmd = "";
			cmd = request.getParameter("cmd");
			int id = 0;
			id = Integer.parseInt(request.getParameter("id"));

			if (cmd.equals("consulta")) {
				IClienteDao idao = new ClienteDao();
				Cliente resp = idao.findByNome(cmd);

				if (resp != null) { // encontrou o cliente pelo id e este indo saindaConsulta
					// dados do banco
					request.setAttribute("cliente", resp);
					request.getRequestDispatcher("saidaconsulta.jps").forward(request, response);
				} else {
					// quando nao encontro
					request.setAttribute("msg", "Cliente não encontrado");
					request.getRequestDispatcher("saidaerro.jsp").forward(request, response);
				}
			}

		} catch (Exception ex) {
			// quando manipula e lança uma variavel fora
			request.setAttribute("msg", "Erro interno da aplicação");
			request.getRequestDispatcher("saidaerro.jps").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
	try {
			RequestCliente requestobj = new RequestCliente();

			requestobj.ofCliente(request.getParameter("nome"), 
								 request.getParameter("email"));
								 
								 ClienteDao dao = new ClienteDao();
			Integer chave = dao.createClienteEndereco(requestobj);
			
			request.setAttribute("obj",requestobj);
			request.getRequestDispatcher("saida.jsp").forward(request, response);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}							 

}
