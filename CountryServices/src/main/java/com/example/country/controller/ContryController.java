package com.example.country.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.country.model.Population;


@RestController
@RequestMapping("country")
public class ContryController {

	
	
	// retrieve canada population
	@GetMapping("getCanadaPopulation")
	public Population getCanadaPopulation()
	{
		Population p1=new Population();
		p1.setTotalFemalePopulation(100000);
		p1.setTotalMalePopulation(300000);
		p1.setTotalPopulation(400000);
		
		return p1;
	}
	
	// retrieve france population
	@GetMapping("getFrancePopulation")
	public Population getFrancePopulation()
	{
		Population p1=new Population();
		p1.setTotalFemalePopulation(100000);
		p1.setTotalMalePopulation(300000);
		p1.setTotalPopulation(400000);
		
		return p1;
	}
	
	// retrieve germany population
	@GetMapping("getGermanyPopulation")
	public Population getGermanyPopulation()
	{
		Population p1=new Population();
		p1.setTotalFemalePopulation(100000);
		p1.setTotalMalePopulation(300000);
		p1.setTotalPopulation(400000);
		
		return p1;
	}
}
