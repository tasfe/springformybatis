package com.hedgehog.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/agent")
public class AgentController {
	@RequestMapping(method=RequestMethod.GET)
	  public String showHomePage(Map<String, Object> model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
	    return "agent";
	  }

}
