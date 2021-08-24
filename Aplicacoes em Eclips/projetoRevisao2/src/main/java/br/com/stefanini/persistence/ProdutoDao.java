package br.com.stefanini.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.dto.ProdutoDto;

public class ProdutoDao extends Dao implements IProdutoDao {

	@Override
	public List<ProdutoDto> findAll() throws Exception {
		open();
		stmt = con.prepareStatement("select p.id , p.nome, p.preco, i.quantidade from produto p \n"
				+ "inner join item i " + "on.p.id = i.id_produto");

		List<ProdutoDto> lista = new ArrayList<ProdutoDto>();
		rs = stmt.executeQuery();

		while (rs.next()) {
			ProdutoDto dto = new ProdutoDto();
			dto.setId((long) rs.getInt(1));
			dto.setNome(rs.getString(2));
			dto.setPreco(rs.getDouble(3));
			dto.setQuantidade(rs.getInt(4));
			lista.add(dto);

		}
		close();
		return null;
	}

	public static void main(String[] args) {

		try {
			for (ProdutoDto d : new ProdutoDao().findAll()) {

				System.out.println(d);
			}
		} catch (Exception e) {

				e.printStackTrace();
		}

	}
}
