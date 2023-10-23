package com.capg.dao;

import java.util.List;

import com.capg.entity.Bikes;

public interface BikesDao {
	public String addBikes(Bikes bike) ;
	public List<Bikes> getAllBikes();

}
