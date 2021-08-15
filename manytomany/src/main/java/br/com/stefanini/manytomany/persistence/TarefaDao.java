package br.com.stefanini.manytomany.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.manytomany.entity.Tarefa;

public class TarefaDao extends Dao {

	public List<Tarefa> findSelectAllTarefa() throws Exception {
		open();
		stmt = con.prepareStatement("select idTarefa, NomeTarefa");
		rs = stmt.executeQuery();
		List<Tarefa> lista = new ArrayList<>();
		while (rs.next()) {
			Tarefa t = new Tarefa();
			t.setIdTarefa(rs.getInt("idTarefa"));
			t.setNomeTarefa(rs.getString("nomeTarefa"));

			lista.add(t);
		}

		close();
		return lista;
	}

}
