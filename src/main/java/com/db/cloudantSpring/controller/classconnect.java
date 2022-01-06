package com.db.cloudantSpring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudant.client.api.CloudantClient;
 


@RestController
@RequestMapping("ibmclouddb")
public class classconnect {
	
	@Autowired
	private CloudantClient db;
	
	@GetMapping("getdetails")
	public List getDbEntries()
	{
		List<String> list = new ArrayList<>();
		
		return db.getAllDbs();
		
		
		
		
	}

}
