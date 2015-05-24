package com.asstmgm.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asstmgm.model.LocationDetails;
import com.asstmgm.services.LocationDetailsService;
@Service
@Transactional
public class LocationDetailsServiceImpl implements LocationDetailsService {

	@Override
	public void addLocation(LocationDetails locatioDetails) {
		// TODO Auto-generated method stub

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
