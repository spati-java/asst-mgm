package com.asstmgm.dao;

import java.util.List;


import com.asstmgm.model.LocationDetails;

public interface LocationDetailsDao {

	public void addLocation(LocationDetails locatioDetails);

	public void editLocation(LocationDetails locatioDetails);

	public LocationDetails getLocation(long locId);

	public List<LocationDetails> getAllLocations();

}
