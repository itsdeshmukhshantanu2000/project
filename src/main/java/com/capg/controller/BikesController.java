package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Bikes;
import com.capg.service.BikesService;

@RestController
@RequestMapping("/bikesapi")
public class BikesController {
	
	@Autowired
	private BikesService cs;
	
	@PostMapping("/add")
	public String addBikes(@RequestBody Bikes c) {
		return cs.addBikes(c);
		
	}
	@GetMapping("/get")
	public List<Bikes> getAllBikes(){
		return cs.getAllBikes();
	}
	
	
	

}
