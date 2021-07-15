package com.spring.pan.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.pan.entity.Pan;
import com.spring.pan.service.PanService;
import com.spring.pan.util.HibernateUtil;

@Controller
public class PanController {

	@Autowired
	private PanService service;
	

	
	
	
	@RequestMapping("/")
	public String showIndexPage() {
		
		return "index";
		
	}

	@RequestMapping(value = "/checkEligibility", method = RequestMethod.POST)
	public String registerPan(@RequestParam("pan") String pan) {
		Pan pan1=new Pan();
		try {
		pan1 = service.fetch(pan);
		}
		catch(Exception e){
			return "checkEligibility3";
		}
		
		if (pan1 == null)
			return "checkEligibility3";
		else if (pan1.getScore() >= 5.0)
			return "checkEligibility";
		else if (pan1.getScore() < 5)
			return "checkEligibility2";
		else
			return "index";
		

	}

	@RequestMapping("/checkEligibility1")
	public String showEligibilityPage() {

		return "checkEligibility";
	}

	@RequestMapping("/checkEligibility2")
	public String showEligibility2Page() {

		return "checkEligibility2";
	}

	@RequestMapping("/checkEligibility3")
	public String showEligibility3Page() {

		return "checkEligibility3";
	}

	public PanService getService() {
		return service;
	}

	public void setService(PanService service) {
		this.service = service;
	}
}
