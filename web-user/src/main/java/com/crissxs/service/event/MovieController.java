package com.crissxs.service.event;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	
	private static Map<String,Integer> mapMovieToImbdId;
	
	static {
		
		mapMovieToImbdId = new LinkedHashMap<String,Integer>();
		mapMovieToImbdId.put("An awesome movie", 11);
	}
	
	@RequestMapping(value = "/event/movies")
	public Map<String,Integer> getEventCategories(){
		return mapMovieToImbdId;
	}
	

}
