package br.com.stefanini.projetoRelacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetoRelacionamento.dto.response.ResponseException;
import br.com.stefanini.projetoRelacionamento.entity.Address;
import br.com.stefanini.projetoRelacionamento.repository.AddressRepository;

@ResponseBody
@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressRepository adressRepository;
	
	
//	@GetMapping("/findall")
//	public List<Address> findAllAddresses(){
//		//return AddressRepository.findAll();
//		
//	}

	

}
