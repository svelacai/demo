package com.com.protopitpoBench.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banco")
public class controller {
	
	@GetMapping("/getCliente")
	public ResponseEntity<?> consultar() {
		
		return new ResponseEntity<>("hello word", HttpStatus.OK);
	}

}
