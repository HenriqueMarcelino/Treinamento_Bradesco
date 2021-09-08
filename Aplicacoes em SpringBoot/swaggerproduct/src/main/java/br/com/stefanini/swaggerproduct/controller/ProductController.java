package br.com.stefanini.swaggerproduct.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.swaggerproduct.entity.Product;
import br.com.stefanini.swaggerproduct.repository.ProductRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;


@Api(value="ProductController", tags= {"Product Controller "})
@SwaggerDefinition(tags= { @Tag(name="Product Controller", 
description="Crud in rest for ProductController")})
@ResponseBody
@RestController
@RequestMapping("/v2")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@ApiOperation(value="List of all products", response = ArrayList.class, tags= "produts")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="ok"),
			@ApiResponse(code=404, message="product not foud"),
			@ApiResponse(code=401, message="error permission"),
	})
	
	@RequestMapping(value ="/products", method=RequestMethod.GET, produces="application/json")
	public List<Product> findAll(){
		return repository.findAll();
		
	}

	@ApiOperation(value="save products")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="ok"),
			@ApiResponse(code=500, message="product not foud"),
	})
	
	
	@RequestMapping(value ="/products", method=RequestMethod.POST, produces="application/json")
	public List<Product> save(@RequestBody Product product){
		try {
			Product resp = repository.save(product);
			
			if(resp==null) {
				throw new Exception("Deu ruim");
			}
			return ResponseEntity.status(200).body(resp);
		}catch(Exception ex) {
			return ResponseEntity.status(500).body("error :" + ex.getMessage());
		}
		
	}
}
