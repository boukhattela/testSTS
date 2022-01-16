package tn.esprit.monta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.monta.entities.City;
import tn.esprit.monta.repositories.ICityRepository;

@RestController
public class CityController {
	
	@Autowired
	private ICityRepository cityRepository;
	
	@RequestMapping(value="/getAllCity")
	 List<City> listeCity(){
		 
		 return cityRepository.findAll();
	 }
	 

}
