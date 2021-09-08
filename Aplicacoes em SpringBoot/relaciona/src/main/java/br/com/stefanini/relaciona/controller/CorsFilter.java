package br.com.stefanini.relaciona.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CorsFilter implements Filter {

	public CorsFilter() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain) throws IOException,
	ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setHeader("Acess-Control-Allow-Origin", "*");
		resp.setHeader("Acess-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
		resp.setHeader("Acess-Control-Max-Age", "3600");
		resp.setHeader("Acess-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		resp.setHeader("Acess-Control-Expose-Headers", "Location");
		chain.doFilter(request,response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
