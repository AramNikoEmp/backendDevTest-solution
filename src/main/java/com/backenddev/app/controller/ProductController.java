package com.backenddev.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backenddev.app.exception.ControllerCommonException;
import com.backenddev.app.model.Product;
import com.backenddev.app.service.impl.ProductServiceImpl;
import com.backenddev.app.utils.constants.Constants;


@RestController
public class ProductController {

	@Autowired(required = false)
	ProductServiceImpl prodServImpl;
	
	@GetMapping(value = Constants.SIMILARID_ENDPOINT)
	public ResponseEntity<List<Product>> getProducts(@PathVariable("id") Integer id) {
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(prodServImpl.findProductById(id));
		} catch (Exception e) {
			throw new ControllerCommonException(HttpStatus.BAD_REQUEST, Constants.GETPRODUCT_ERROR);
		}
	}
	
	@ControllerAdvice
	public class ExceptionHandler {
		public ResponseEntity<String> handleExc(ControllerCommonException ex) {
			return ResponseEntity.status(ex.getHttpStatus()).body(ex.getMessage());
		}
	}
}
