package com.codebuffer.cab_book_driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.codebuffer.cab_book_driver.constant.AppConstant;

@Service
public class CabLocationService {
	
	@Autowired
	private KafkaTemplate<String,Object> kafkatemplate;
	
	public boolean updateLocation(String location) {
		
		kafkatemplate.send(AppConstant.CAB_LOCATION,location);
		return true;
		
	}

}
