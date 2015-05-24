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

import com.asstmgm.model.Login;
import com.asstmgm.model.UserDetails;
import com.asstmgm.services.UserDetailsService;

@Controller
public class UserController {

	@Autowired
	UserDetailsService userDetailsService;

	public UserController() {
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public ModelAndView getUserForm(Map<String, Object> map) {
		UserDetails userDetails = new UserDetails();
		return new ModelAndView("addUser", "saveUser", userDetails);
	}
//	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
//	public ModelAndView getDeleteForm(Map<String, Object> map) {
//		UserDetails userDetails = new UserDetails();
//		return new ModelAndView("addUser", "saveUser", userDetails);
//		
//	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveUsers(@ModelAttribute UserDetails userDetails,
			BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		if (action.equalsIgnoreCase("save")) {
			userDetailsService.addUser(userDetails);
		}

	}
	@RequestMapping("/findUser")
	public String showAllUsers(Map<String ,Object> map)
	{
		UserDetails user = new UserDetails();
		
		map.put("user", user);
		map.put("userDetails",userDetailsService.getAllUser());
		return "findUser";
	}
	
	public String doActions(@ModelAttribute UserDetails user, BindingResult result, Map<String, Object> map){
		UserDetails userDetailResult = new UserDetails();
		UserDetails searchedLogin = userDetailsService.getUser(user.getUserId() );
		userDetailResult = userDetailResult!=null ? userDetailResult : new UserDetails();
		
		map.put("udetail", userDetailResult);
		map.put("studentList", userDetailsService.getAllUser());
		
		return "findUser";
			
			}

	

}