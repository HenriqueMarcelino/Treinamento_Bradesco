package br.com.stefanini.projetocache.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import br.com.stefanini.projetocache.entity.Users;
import br.com.stefanini.projetocache.interfaces.IUserService;
import br.com.stefanini.projetocache.repository.UsersRepository;

@Service
public class UsersService implements IUserService {

	@Autowired
	private JavaMailSender senderEmail;

	@Autowired
	UsersRepository repository;

	public Users saveOrUpdate(Users user) {
		// select * from tabela where filter
		
		return repository.findById(user.getId()).map(u ->{
			u.setNome(user.getNome());
			u.setEmail(user.getEmail());
			return repository.save(u);
		}).orElseGet(()->{
			return repository.save(user);
		});
	}
		@Override
		public String enviarEmail(Users u){
			try {
				SimpleMailMessage msg = new SimpleMailMessage();
				msg.setTo(u.getEmail());
				msg.setSubject("Reuniao hoje com os novos contratados stefanini");
				msg.setText("Confirmar o Horario da Reuniao que sera as 23:30");
				
				senderEmail.send(msg);
				return"Email Enviado com Sucesso";
			}catch(Exception ex){
				return"Error no Email :"+ ex.getMessage();
			}
	}			
}

