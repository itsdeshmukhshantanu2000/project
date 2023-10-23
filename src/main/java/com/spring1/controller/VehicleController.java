package com.spring1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring1.entity.Vehicle;
import com.spring1.service.VehicleService;



@RestController
@RequestMapping("/vehicleapi")
public class VehicleController {



	@Autowired
	private VehicleService vservice;



	@PostMapping("/")
	public String add(@RequestBody Vehicle vehicle) {



		return vservice.addVehicle(vehicle);



	}



	@GetMapping("/")
	public List<Vehicle> getAll(@RequestBody Vehicle vehicle) {



		return vservice.getAllVehicle();



	}



}