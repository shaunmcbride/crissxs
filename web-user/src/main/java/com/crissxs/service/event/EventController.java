package com.crissxs.service.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crissxs.service.domain.Event;
import com.crissxs.service.repository.graph.EventRestRepository;

@RestController
public class EventController {
	
	@Autowired
	private EventRestRepository eventRepository;
	
	
	@RequestMapping(value = "/event/new", method = RequestMethod.POST)
	public Event newEvent(@RequestBody Event event){
		return eventRepository.save(event);
		
	}


}
