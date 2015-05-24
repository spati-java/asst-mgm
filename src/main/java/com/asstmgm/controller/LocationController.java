package com.asstmgm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.asstmgm.model.LocationDetails;
import com.asstmgm.model.UserDetails;
import com.asstmgm.services.LocationDetailsService;

@Controller
public class LocationController {

	@Autowired
	private LocationDetailsService locationService;
	
	public LocationController(){
		
	}

	@RequestMapping(value = "/addLocation", method = RequestMethod.GET)
	public ModelAndView getLocationForm(Map<String, Object> map) {
		
		LocationDetails locationDetails= new LocationDetails();
		return new ModelAndView("addLocation", "savelocation", locationDetails);
	}

	@RequestMapping(value = "/saveLocation", method = RequestMethod.POST)
	public void saveUsers(@ModelAttribute LocationDetails locatioDetails,
			BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		if (action.equalsIgnoreCase("save")) {
			locationService.addLocation(locatioDetails);
			
		}


}
}