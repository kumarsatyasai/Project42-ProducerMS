package com.nt.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer-api")
public class ProducerOperationsOneController {
	
	@Value("${username}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	@GetMapping("/display")
	public ResponseEntity<String> showProducerData()
	{
		return new ResponseEntity<String>("Producer One UserName : "+userName+" and Password : "+password,HttpStatus.OK);
	}

}
