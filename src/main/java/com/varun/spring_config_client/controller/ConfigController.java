package com.varun.spring_config_client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/config/v1/")
public class ConfigController {
	
	@Value("#{'${my.greeting.list.values}'.split(',')}")
	private List<String> listValues;
	@Value("${my.greeting}")
	private String greeting;
	
	@GetMapping(value="properties")
	public String getPropertiesFile() {
		return "Greeting : "+greeting+" with values: "+listValues;
	}

}
