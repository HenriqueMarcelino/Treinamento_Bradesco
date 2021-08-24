package br.com.stefanini.mock.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.mock.entity.Pessoa;

public class PessoaDao extends Dao implements IPessoaDao {

	@Override
	public List<Pessoa> findAllPessoa(String nome) throws Exception {
		open();
		stmt = con.prepareStatement("select * from pessoa");
		rs = stmt.executeQuery();
		List<Pessoa> pessoas = new ArrayList<>();
		while (rs.next()) {

			Pessoa pessoa = new Pessoa();
			pessoa.setNome(rs.getString(1));
			pessoa.setTelefone(rs.getString(2));
		}
		close();
		return pessoas;
	}

	@Override
	public Pessoa findById(Integer id) throws Exception {
		open();
		stmt = con.prepareStatement("select * from pessoa where id=?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		Pessoa pessoa = null;
		
		if(rs.next()) {
			pessoa = new Pessoa();
			pessoa.setId(rs.getInt(1));
			pessoa.setNome(rs.getString(2));
			pessoa.setTelefone(rs.getString(3));
		}
		close();
		return pessoa;
	}

	@Override
	public String createdPessoa(Pessoa pessoa) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa(nome, telefone,values(?,?)");
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getTelefone());
		stmt.executeUpdate();

		close();
		return "Pessoa cadastrada com sucesso!!";
	}

	@Override
	public String updatePessoa(Pessoa pessoa) throws Exception {
		open();
		stmt = con.prepareStatement("update pessoa set nome=?, telefone=?, where nome=?");
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getTelefone());
		stmt.executeUpdate();

		close();
		return "Informações de pessoa atualizadas com sucesso!!";

	}

	@Override
	public String deletePessoa(Integer id) throws Exception {
		open();
		stmt = con.prepareStatement("delete from pessoa where id=?");
		stmt.setInt(1, id);
		stmt.executeUpdate();
		
		return "Informações deletadas com sucesso";
	}

}
