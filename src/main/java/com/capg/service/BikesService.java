package com.capg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.dao.BikesDao;
import com.capg.entity.Bikes;

@Service
public class BikesService implements BikesDao {
    List<Bikes> bikeList=new ArrayList<>();
    
	public String addBikes(Bikes bike) {
		
		bikeList.add(bike);
		return "Bike addded Sussesful";
	}

	public List<Bikes> getAllBikes() {
		// TODO Auto-generated method stub
		return bikeList;
	}
	

}
