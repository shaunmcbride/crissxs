package gov.crissxs.integration.service;

import org.springframework.stereotype.Service;

@Service
public class MyLogger<T> {
	
	
	public void log(T message){
		System.out.println(message.toString());
	}

}
