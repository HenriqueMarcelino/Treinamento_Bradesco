package br.com.stefanini.manytomany.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.manytomany.entity.Funcionario;

public class FuncionarioDao  extends Dao{

	 public List<Funcionario> findSelectAllFuncionario() throws Exception{
		  open();
		  stmt = con.prepareStatement("select idFuncionario, nomeFuncionario from funcionario");
		   rs = stmt.executeQuery();
		   List<Funcionario> lista = new ArrayList<>();
		    while(rs.next()) {
		    	Funcionario f = new Funcionario();
		      	            f.setIdFuncionario(rs.getInt("idFuncionario"));
		                    f.setNomeFuncionario(rs.getString("nomeFuncionario")); 
		    	         lista.add(f);
		    }
		  close();
		  return lista;
	 }
	 

      public Funcionario findByCode(Integer code) throws Exception {
    	  open();
		  stmt = con.prepareStatement("select  * from funcionario where idFuncionario=?");
		      stmt.setInt(1, code);
		      rs = stmt.executeQuery();
		      Funcionario func = null;
		      if(rs.next()) {
		    	  func = new Funcionario();
		      	            func.setIdFuncionario(rs.getInt("idFuncionario"));
		                    func.setNomeFuncionario(rs.getString("nomeFuncionario")); 
		    }
		  close();
		  return func;
     }
	 
}
