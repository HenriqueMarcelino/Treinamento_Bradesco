package br.com.stefanini.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.stefanini.login.entity.Usuario;
import br.com.stefanini.login.persistence.UsuarioDao;

 
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		   try {
			   
			   String flag = request.getParameter("flag");
			   
			   switch(flag) {
			    case "gravar":
			    	    gravar(request,response);
		    	        break;
			    case "logar":
			    	       logar(request, response);
			    	        break;
			    case "logout":
			    	     //  logout(request, response);
			               break;
 
			  }
		   }catch(Exception ex) {
			   ex.printStackTrace();
		   }
		
	}

	
	
	protected void logar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   try {
		UsuarioDao dao = new UsuarioDao();
             
	         Usuario usuario = new Usuario();
	           usuario.setEmail(request.getParameter("email"));
	           usuario.setSenha(request.getParameter("senha"));
	     
	     Usuario resp = dao.logar(usuario);
	      HttpSession session = null;
 	     if (resp!=null) {
 	    	session = request.getSession(true);
 	    	session.setAttribute("logado", resp);
 	    	 response.sendRedirect("http://localhost:8083/projetoServicoJson/usuario/logado.jsp"); 
 	     }
 	     
 	     
	   }catch(Exception ex) {
		   ex.printStackTrace();
	   }
	}
	
	
//
//     protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		
//	}
	

     protected void gravar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
    		 Usuario u = new Usuario();
    		   u.setNome(request.getParameter("nome"));
               u.setEmail(request.getParameter("email"));
               u.setSenha(request.getParameter("senha"));
    		  new UsuarioDao().gravar(u);
    		  request.setAttribute("msg","dados Gravados");
    		  request.getRequestDispatcher("sistema.jsp").forward(request, response);
    		
    		
    		
    	}catch(Exception ex) {
 
    		request.setAttribute("msg","Erro na Gravacao");
    		request.getRequestDispatcher("sistema.jsp").forward(request, response);
    		
    	}
 	}

	
}
