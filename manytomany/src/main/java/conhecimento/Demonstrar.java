package conhecimento;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demonstrar {
	
	public static void main(String[] args) {
		
		
		//Fazendo o crud
		String [] vetor= { new String("luis"),"Joao","Carlos","Miguel"};
		Arrays.sort(vetor);
		
		List <String> lista = Arrays.asList(vetor);
		
		// lista.add("Marcelo");
		System.out.println(lista);
		lista.set(0,"belem");
			boolean resp = lista.remove("Jose");
		System.out.println(resp);
			
			System.out.println(lista);
		Collections.sort(lista);
		
			String nome = lista.contains("Joao")? lista.get(lista.indexOf("Joao")):"Não encontrado";
			System.out.println("status : "+ nome);
		
	}

}
