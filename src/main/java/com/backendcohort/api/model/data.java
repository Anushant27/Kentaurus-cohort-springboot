package com.backendcohort.api.model;

import org.springframework.stereotype.Component;

@Component
public class data {
	
	public String value;

	public data() {
		System.out.println("Initializing Default Constructor");
		this.value="default";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	
	

}
