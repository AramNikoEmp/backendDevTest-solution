package com.backenddev.app.service;

import java.util.List;

import com.backenddev.app.model.Product;

public interface IProductService {

	/**
	 * Find product by Id
	 * @param id
	 * @return List
	 */
	List<Product> findProductById(Integer id);
}
