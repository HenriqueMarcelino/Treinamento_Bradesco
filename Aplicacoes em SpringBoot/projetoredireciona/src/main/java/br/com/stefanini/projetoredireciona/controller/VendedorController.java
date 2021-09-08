package br.com.stefanini.projetoredireciona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetoredireciona.entity.Usuario;
import br.com.stefanini.projetoredireciona.entity.Vendedor;
import br.com.stefanini.projetoredireciona.repository.UsuarioRepository;
import br.com.stefanini.projetoredireciona.repository.VendedorRepository;

@ResponseBody
@RestController
@RequestMapping("/vendedor")
public class VendedorController {

	@Autowired
	VendedorRepository vendedorRepository;

	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping("/vendedor/{email}")
	public ResponseEntity<?> findEmail(@PathVariable("email") String email) {
		try {

			Usuario usuario = usuarioRepository.findByEmail(email);
			Vendedor vendedor = new Vendedor();
			vendedor.setNome(usuario.getNome());
			vendedor.setEmail(usuario.getEmail());
			vendedor.setSenha(usuario.getSenha());
			vendedor.setComissao(0.1);

			Vendedor resp = vendedorRepository.save(vendedor);

			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			return ResponseEntity.status(200).body("error:" + ex.getMessage());
		}
	}

}
