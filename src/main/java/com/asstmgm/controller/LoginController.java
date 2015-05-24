package com.asstmgm.controller;

import java.util.List;
import java.util.Map;

import com.asstmgm.model.Login;
import com.asstmgm.services.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

//	@RequestMapping(value = "/productPage", method = RequestMethod.POST)
//	public String launchProductPage() {
//		return "userList";
//	}

	@RequestMapping(value = "/addLogin", method = RequestMethod.GET)
	public ModelAndView setForm(Map<String, Object> map) {
		Login login = new Login();
		return new ModelAndView("addLogin", "login", login);
	}

	/*@RequestMapping("/findUser")
	 public ModelAndView getAllContacts(Login login,@RequestParam(value="useerName" ,required=false) String useerName) {
		ModelAndView mav = new ModelAndView("findUser", "userDetails",
				loginService.getLoginName(useerName));

		return mav;
	}*/
	/*@RequestMapping("/findUser")
	public String showAllUsers(Map<String ,Object> map)
	{
		Login login = new Login();
		
		map.put("login", login);
		map.put("loginDetails",loginService.getAllUser());
		return "findUser";
	}
	public String doActions(@ModelAttribute Login login, BindingResult result, Map<String, Object> map){
		Login loginResult = new Login();
		Login searchedLogin = loginService.getLogin(login.getLoginId());
		loginResult = loginResult!=null ? loginResult : new Login();
		
		map.put("login", loginResult);
		map.put("studentList", loginService.getAllUser());
		
		return "findUser";
			
			}
*/
	
	/*
	 * @RequestMapping(value="/productPage",method=RequestMethod.POST) public
	 * ModelAndView addLoginDetails (Login login ,
	 * 
	 * @RequestParam(value="useerName" ,required=false) String useerName){
	 * 
	 * 
	 * loginService.add(login);
	 * 
	 * System.out.println(loginService.getAllUser().toArray());
	 * 
	 * return new ModelAndView( "userList","login",loginService.getAllUser()); }
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}

}
