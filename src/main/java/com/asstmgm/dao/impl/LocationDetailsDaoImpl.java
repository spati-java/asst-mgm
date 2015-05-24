package com.asstmgm.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.asstmgm.dao.LocationDetailsDao;
import com.asstmgm.model.LocationDetails;

@Repository
@Transactional
public class LocationDetailsDaoImpl implements LocationDetailsDao{

	@Autowired
	private SessionFactory session;
	@Override
	public void addLocation(LocationDetails locatioDetails) {
	session.getCurrentSession().save(locatioDetails);
		
	}
	@Override
	public void editLocation(LocationDetails locatioDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocationDetails getLocation(long locId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationDetails> getAllLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}
