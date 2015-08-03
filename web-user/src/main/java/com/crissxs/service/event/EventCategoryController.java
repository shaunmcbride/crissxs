package com.crissxs.service.event;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventCategoryController {

	private static Map<String,String> mapCategoryToService;
	
	static {
		
		mapCategoryToService = new LinkedHashMap<String,String>();
		mapCategoryToService.put("Movie", "/event/movies");
	}
	
	@RequestMapping(value = "/event/categories")
	public Map<String,String> getEventCategories(){
		return mapCategoryToService;
	}
	
	
	
}
