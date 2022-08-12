package com.example.aggregate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.aggregate.model.Population;

@RestController
@RequestMapping("aggregate")
@ComponentScan(basePackages = "com.example.country.controller")
public class AggregateController {

	
	
	// retrieve all population data from 3 countries
	@GetMapping("getPopulation")
	public Population getAllStudent()
	{
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Population> result1 = restTemplate.getForEntity("http://localhost:8082/country/getCanadaPopulation", Population.class);
		ResponseEntity<Population> result2 = restTemplate.getForEntity("http://localhost:8082/country/getFrancePopulation", Population.class);
		ResponseEntity<Population> result3 = restTemplate.getForEntity("http://localhost:8082/country/getGermanyPopulation", Population.class);
		
		int totalpopulation=result1.getBody().getTotalPopulation() + result2.getBody().getTotalPopulation() + result3.getBody().getTotalPopulation();
		int malepopulation=result1.getBody().getTotalMalePopulation() + result2.getBody().getTotalMalePopulation() + result3.getBody().getTotalMalePopulation();
		int femalepopulation= result1.getBody().getTotalFemalePopulation() + result2.getBody().getTotalFemalePopulation() + result3.getBody().getTotalFemalePopulation();
		
		Population total=new Population();
		total.setTotalPopulation(totalpopulation);
		total.setTotalMalePopulation(malepopulation);
		total.setTotalFemalePopulation(femalepopulation);
		
		return total;

		
	}
	
	
}
