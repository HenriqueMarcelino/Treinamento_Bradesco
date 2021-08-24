package br.com.stefanini.projetoQuatro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.projetoQuatro.dto.request.RequestCliente;
import br.com.stefanini.projetoQuatro.model.Cliente;
import br.com.stefanini.projetoQuatro.persistence.ClienteDao;
import br.com.stefanini.projetoQuatro.persistence.IClienteDao;

@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public ClienteController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String cmd="";
			cmd = request.getParameter("cmd");
			int id=0;
			id = Integer.parseInt(request.getParameter("id"));
			
			if (cmd.equals("consulta")) {
				IClienteDao idao = new ClienteDao();
				Cliente resp = idao.findByCode(id);
				
				if (resp!=null) { // encontrou o cliente pelo id e este indo saindaConsulta
					//dados do banco
					request.setAttribute("cliente", resp);
					request.getRequestDispatcher("saidaconsulta.jps").forward(request, response);
				}
				else {
					//quando nao encontro
					request.setAttribute("msg","Cliente não encontrado");
					request.getRequestDispatcher("saidaerro.jsp").forward(request, response);
				}
			}
			
		}catch(Exception ex) {
			// quando manipula e lança uma variavel fora
			request.setAttribute("msg","Erro interno da aplicação");
			request.getRequestDispatcher("saidaerro.jps").forward(request, response);
		}
		
	}

	// Disparo das informações.
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
try {
		RequestCliente requestobj = new RequestCliente();

		// Gravando no banco de dados

		requestobj.ofCliente(request.getParameter("nome"), 
							 request.getParameter("email"), 
							 request.getParameter("senha"));
		
		String numero1 = request.getParameter("numero1");
		String numero2 = request.getParameter("numero2");

		requestobj.ofTelefones(numero1, numero2);
		
		ClienteDao dao = new ClienteDao();
		Integer chave = dao.createClienteTelefone(requestobj);
		
		request.setAttribute("obj",requestobj);
		request.getRequestDispatcher("saida.jsp").forward(request, response);
		
	}catch(Exception ex) {
		ex.printStackTrace();
		//request.setAttribute("msg", "Erro interno da aplicação");
		//request.getRequestDispatcher("saidaerro.jsp").forward(request, response);
	}
		
		
		//response.getWriter().print(requestobj.getCliente());
		
		// redirecionando para a saída

//		request.setAttribute("obj", requestobj);
//		request.getRequestDispatcher("saida.jsp").forward(request, response);
 
	}

}
