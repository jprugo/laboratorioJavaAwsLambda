package com.neoris.laboratorioJavaAwsLambda.entities;

public class Product {
	
	private long id;
	
	private double value;
	
	private String description;

	protected Product() {
		super();
	}

	public Product(long id, double value, String description) {
		super();
		this.id = id;
		this.value = value;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
