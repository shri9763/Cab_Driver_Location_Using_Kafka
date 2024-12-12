package com.codebuffer.cab_book_driver.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebuffer.cab_book_driver.service.CabLocationService;

@RestController
@RequestMapping("/location")
public class CabLocationController {
	
	@Autowired
	private CabLocationService service;
	
	
	
	@PutMapping
	public ResponseEntity updateLocation() throws InterruptedException {
		int range=100;
		
		while(range>0) {
			range--;
			service.updateLocation(Math.random()+" : "+Math.random());
			Thread.sleep(1000);
			
		}
		return new ResponseEntity<>(Map.of("Message","Location Updated"),HttpStatus.OK);
	}

}
