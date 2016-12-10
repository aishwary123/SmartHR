package com.sap.aish.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sap.aish.domain.JobSeekerLoginDetails;
import com.sap.aish.services.LoginUserDetailsService;
import com.sap.aish.util.MyUtil;

@Controller
public class LoginController {

	
	private static final Log log = LogFactory.getLog(LoginController.class);
	
	@Autowired
	private LoginUserDetailsService loginUserDetailsService;
	
	@RequestMapping(path="/signup",method=RequestMethod.GET)
	public String signup(Model model){
		model.addAttribute("signup",new JobSeekerLoginDetails());
		log.info("signup get handler method called");
		return "signup";
	}
	
	@RequestMapping(path="/signup",method=RequestMethod.POST)
	@ResponseBody
	public String signup(ModelMap map,JobSeekerLoginDetails jobSeekerLoginDetails){
	
		log.info("signup post handler method called");
		loginUserDetailsService.saveFirstLoginOfUser(jobSeekerLoginDetails);
		return "Record added";
	}
	
	
}
