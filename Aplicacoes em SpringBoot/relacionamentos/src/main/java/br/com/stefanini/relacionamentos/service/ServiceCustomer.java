package br.com.stefanini.relacionamentos.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.stefanini.relacionamentos.dto.RequestDto;
import br.com.stefanini.relacionamentos.entity.Customer;
import br.com.stefanini.relacionamentos.entity.Mobile;
import br.com.stefanini.relacionamentos.interfaces.IServiceCustomer;
import br.com.stefanini.relacionamentos.repository.CustomerRepository;
import br.com.stefanini.relacionamentos.repository.MobileRepository;

public class ServiceCustomer implements IServiceCustomer {

	@Autowired
	private CustomerRepository repository;

	@Autowired
	MobileRepository mobrepository;
	

	@Override
	public Integer save(RequestDto dto) {

		try {
			String id = UUID.randomUUID().toString();
			Customer customer = new Customer(id, dto.getName());
			Mobile mobil = null;

			Customer resp = repository.save(customer);

			if (resp != null) {
				mobil = new Mobile(dto.getNameMobile(), dto.getPrice(), id);
				mobrepository.save(mobil);
			}

			return 1;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}

	}

}
