package br.com.stefanini.projetostruts.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.projetostruts.entity.Pessoa;

public class PessoaFile implements IPessoaFile {
 
	FileWriter writer;
	FileReader reader;
	BufferedReader bf;
	@Override
	public void open() throws Exception {
		writer = new FileWriter("c:/temp/strutsfile.csv",true);
		
	}

	@Override
	public void close() throws Exception {
		 writer.close();
		
	}

	@Override
	public void write(Pessoa p) throws Exception {
		 writer.write(p.getIdPessoa() + ";" + p.getNome() + ";" + p.getIdade() + "\n" );
		 writer.flush();
	}

	@Override
	public List<Pessoa> read() throws Exception {
		   reader = new FileReader("c:/temp/strutsfile.csv");
		    bf = new BufferedReader(reader);
		    List<Pessoa> lista = new ArrayList<Pessoa>();
		    String linha ="";
		    while((linha = bf.readLine())!=null){
		    	String pedacos[]=linha.split(";");
		    	Pessoa pessoa  =new Pessoa();
		    	  pessoa.setIdPessoa(new Integer(pedacos[0]));
		    	  pessoa.setNome(pedacos[1]);
		    	  pessoa.setIdade(new Integer(pedacos[2]));
		    	  lista.add(pessoa);
		    }
		    return lista;
	}

	
	public static void main(String[] args) {
		
		 try {
			 Pessoa p = new Pessoa(10,"belem",48);
			 Pessoa p1 = new Pessoa(11,"lu",19);
			 Pessoa p2 = new Pessoa(12,"gabriel",24);
			 PessoaFile pf =new PessoaFile();
			 
			  
// 			  pf.open();
//     		  pf.write(p1);
// 			  pf.close(); 
// 			  pf.open();
// 			  pf.write(p2);
// 			  pf.close(); 
//			 System.out.println("ok");
			 
			 
			 
			 List <Pessoa> resposta = pf.read();
			 
			  System.out.println(resposta);
			 
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }
		
		
	}
}
