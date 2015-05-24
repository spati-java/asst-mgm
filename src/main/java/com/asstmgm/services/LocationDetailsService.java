package com.asstmgm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asstmgm.model.LocationDetails;

@Service
public interface LocationDetailsService {

	public void addLocation(LocationDetails locatioDetails);

	public void editLocation(LocationDetails locatioDetails);

	public LocationDetails getLocation(long locId);

	public List<LocationDetails> getAllLocations();

}
