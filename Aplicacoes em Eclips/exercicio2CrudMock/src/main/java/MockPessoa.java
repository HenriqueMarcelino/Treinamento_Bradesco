import java.util.List;

import br.com.stefanini.mock.entity.Pessoa;
import br.com.stefanini.mock.persistence.PessoaDao;

public class MockPessoa {

	public static void main(String[] args) {

		MockPessoa mockPessoa = new MockPessoa();
		PessoaDao pessoaDao = new PessoaDao();

		try {

			Pessoa pessoa = pessoaDao.findById(1);
			pessoa.setNome("TesteMock");
			mockPessoa.updateMockPessoa(pessoa);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void findAllMockPessoa() {
		try {
			List<Pessoa> pessoa = new PessoaDao().findAllPessoa("pessoa");
			System.out.println(pessoa);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createMockPessoa(Pessoa pessoa) {
		try {
			PessoaDao pessoaDao = new PessoaDao();
			System.out.println(pessoaDao.createdPessoa(pessoa));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateMockPessoa(Pessoa pessoa) {
		try {
			PessoaDao pessoaDao = new PessoaDao();
			System.out.println(pessoaDao.updatePessoa(pessoa));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteMockPessoa(Integer id) {

		try {
			PessoaDao pessoaDao = new PessoaDao();
			System.out.println(pessoaDao.deletePessoa(id));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
