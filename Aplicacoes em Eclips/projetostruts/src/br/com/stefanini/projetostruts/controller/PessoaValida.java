package br.com.stefanini.projetostruts.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PessoaValida {

	
	  public void validarNome(String nome) {
		  Pattern p  = Pattern.compile("[a-zA-Z]{2,50}");
		  Matcher m = p.matcher(nome);
		  if (!m.matches()) {
			  throw new IllegalArgumentException("Nome Invalido ");
		  }
	  }
	
	 
	  public void validarIdade(Integer idade) {
                if (idade < 0 || idade >130) {
              	  throw new IllegalArgumentException("idade Invalido ");	
                }
	  }
	  
	  
}
