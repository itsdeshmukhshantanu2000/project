package com.spring1.dao;
import java.util.List;
import com.spring1.entity.Vehicle;

public interface VehicleDao {



	String addVehicle(Vehicle v);



	List<Vehicle> getAllVehicle();



}