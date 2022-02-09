package com.backendcohort.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendcohort.api.model.data;

@RestController
public class Word {
	
	@Autowired
	private data Data;
	
	
	@GetMapping("/word")
	public String getword() {
		return Data.getValue();
	}
	
	@PostMapping("/word")
	public data setword(@RequestBody data newdata) {
		Data.setValue(newdata.getValue());
		return Data;
		
	}

}
