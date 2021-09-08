package br.com.stefanini.relacionamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.relacionamentos.dto.RequestDto;
import br.com.stefanini.relacionamentos.dto.ResponseDto;
import br.com.stefanini.relacionamentos.entity.Customer;
import br.com.stefanini.relacionamentos.entity.Mobile;
import br.com.stefanini.relacionamentos.repository.CustomerRepository;
import br.com.stefanini.relacionamentos.repository.MobileRepository;
import br.com.stefanini.relacionamentos.service.ServiceCustomer;

@RestController
@RequestMapping("/api")
public class CustomerController {

	private CustomerRepository repository;

	@Autowired
	private	MobileRepository mobrepository;

	@Autowired
	ServiceCustomer service;
	
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody RequestDto dto) {

		Integer resposta = service.save(dto);

		if (resposta.equals(1)) {
			return ResponseEntity.status(200).body("save");
		} else {
			return ResponseEntity.status(500).body("not save");
		}

	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") String id){
		
		Customer customer = repository.findById(id).get();
		Mobile mobile = mobrepository.findByCustomerId(id);
		try {

			if(customer == null || mobile == null) {
				
				throw new Exception("falha ao consultar");
			}
			
			ResponseDto dto = new ResponseDto();
			dto.setId(customer.getId());
			dto.setName(customer.getName());
			
			dto.setIdMobile(mobile.getId());
			dto.setName(mobile.getNameMobile());
			dto.setPrice(mobile.getPrice());
			dto.setCustomerId(mobile.getCustomerId());
			
			return ResponseEntity.status(200).body(dto);
			
	}catch (Exception ex) {
			return ResponseEntity.status(500).body("error:" + ex.getMessage());
		}
	}
}
