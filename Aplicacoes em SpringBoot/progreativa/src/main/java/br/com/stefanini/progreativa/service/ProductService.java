package br.com.stefanini.progreativa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.stefanini.progreativa.entity.Product;
import br.com.stefanini.progreativa.repository.ProductRepository;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Autowired
	private ReactiveMongoTemplate template;

	public Mono<Long> getProductByCondition(Product product) {
		Query query = getQuery(product);
		return template.count(query, Product.class);
	}

	private Query getQuery(Product product) {
		Query query = new Query();
		Criteria criteria = new Criteria();

		if (!StringUtils.isEmpty(product.getName())) {

			criteria.and("name").is(product.getName());
		}
		query.addCriteria(criteria);
		return query;

	}

}
