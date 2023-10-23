package com.spring1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring1.dao.VehicleDao;
import com.spring1.entity.Vehicle;
import com.spring1.repository.VehicleRepository;
@Service
public class VehicleService implements VehicleDao {



	@Autowired
	VehicleRepository vr;



	public String addVehicle(Vehicle v) {
		vr.save(v);
	



		return "Vehicle added.....";
	}



	public List<Vehicle> getAllVehicle() {
		return vr.findAll();
		



	}



}