package com.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Address;
import com.model.Person;
import com.repository.PersonRepository;
import com.service.PersonService;

@Controller
public class Welcome {

	@Autowired
	PersonService personService;
	
	@Autowired
	PersonRepository pr;
	
	@RequestMapping(value = "/first",method = {RequestMethod.GET})
	protected ModelAndView welcome(ModelAndView mv)	{
		System.out.println("into welcome controller...");
		List<Person> allPersons = personService.getAllPersons();
		mv.addObject("getWelcome", allPersons);
		mv.setViewName("welcome");
		return mv;
	}
	
	@RequestMapping(value = "/welcome",method = {RequestMethod.POST})
	protected String welcome(ModelMap mv ,@RequestParam("fname") String name,@RequestParam("lname") String lname,String address)	{
		Person newPerson = new Person();
		Address addr = new Address();
		addr.setAddress(address);
		addr.setPersonNumberFk(newPerson.getId());
		newPerson.setfName(name);
		newPerson.setlName(lname);
		System.out.println(address);
	
		newPerson.setAddress(Arrays.asList(addr));
		System.out.println(" From query ------ " + pr.byQuery(3));
		personService.addPerson(newPerson);
		
		System.out.println("into welcome controller... " + newPerson);
		mv.addAttribute("getWelcome", name);
		return "result";
	}
}
