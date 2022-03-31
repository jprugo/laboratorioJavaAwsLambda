package com.neoris.laboratorioJavaAwsLambda.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.neoris.laboratorioJavaAwsLambda.entities.Product;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	private static List<Product> products = Arrays.asList(
			new Product(1, 20, "Masmelo"),
			new Product(1, 20, "Milo"),
			new Product(1, 20, "Pringles"),
			new Product(1, 20, "Doritos")
	);
	
	@GetMapping
	public ResponseEntity<List<Product>> get(){
		return ResponseEntity.ok(products);
	}

}
