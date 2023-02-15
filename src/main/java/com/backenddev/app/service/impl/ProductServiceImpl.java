package com.backenddev.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backenddev.app.model.Product;
import com.backenddev.app.utils.constants.Constants;

@Service
public class ProductServiceImpl {

	@Autowired
	RestTemplate restTemplate;
	
	public List<Product> findProductById(Integer id) {
		List<Product> simProducts = new ArrayList<>();
		simProducts = this.getIdList(id).stream().map(e ->
			restTemplate.getForObject(Constants.LOCALHOST_PROD_SIMILARID_TEMPLATE.replace("{productId}", 
				Integer.toString(e)), Product.class)
		).collect(Collectors.toList());
		
		return simProducts;
	}

	/**
	 * REST for get list of ids
	 * @param id
	 * @return List of ids
	 */
	private List<Integer> getIdList(Integer id) {
		ResponseEntity<List<Integer>> idList = restTemplate.exchange(Constants.LOCALHOST_PROD_SIMILARID_TEMPLATE.replace("{productId}", 
				Integer.toString(id)), HttpMethod.GET, null, new ParameterizedTypeReference<List<Integer>>(){});
		return idList.getBody();
	}
	

}
