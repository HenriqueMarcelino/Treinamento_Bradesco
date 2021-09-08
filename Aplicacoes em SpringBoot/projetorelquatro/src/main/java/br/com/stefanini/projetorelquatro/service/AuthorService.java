package br.com.stefanini.projetorelquatro.service;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stefanini.projetorelquatro.entity.Author;
import br.com.stefanini.projetorelquatro.entity.Post;
import br.com.stefanini.projetorelquatro.interfaces.IAuthorService;
import br.com.stefanini.projetorelquatro.repository.AuthorRepository;
import br.com.stefanini.projetorelquatro.repository.PostRepository;

@Service
public class AuthorService implements IAuthorService{

	@Autowired
	private AuthorRepository authorRespository;
	
	@Autowired
	private PostRepository postRespository;
	
	
	@Transactional(rollbackOn = {Exception.class})
	public Object createAuthor(Author author) throws Exception {
		Set<Post> posts = author.getPosts();
		Author resp = authorRespository.save(author);
		
		if(resp==null) {
			throw new Exception("Erro na gravação do Author...");
		}
		for(Post p: posts) {
			p.setAuthor(resp);
			postRespository.save(p);
		}
		return resp;
	}

}
