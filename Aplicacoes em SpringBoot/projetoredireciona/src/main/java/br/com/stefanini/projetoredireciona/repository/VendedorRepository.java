package br.com.stefanini.projetoredireciona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetoredireciona.entity.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

	public Vendedor findByEmail(String email);

}
