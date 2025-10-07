package com.example.Assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Assignment.dto.Travel;
import com.example.Assignment.repository.TravelRepository;

@Controller
public class TravelController {
	
	@Autowired
	TravelRepository travelRepository;
	
	@GetMapping("/")
	public String loadmain() {
		return "main.html";
	}
	
	@GetMapping("/insert")
	public String loadinsertion() {
		return "insert.html";
	}
	
	@PostMapping("/insert")
	public String saverecord(@ModelAttribute Travel travel, ModelMap map) {
		travelRepository.save(travel);
		map.put("message", " added successfully");
		return "main.html";
	}
	
	@GetMapping("/fetch")
	public String fetch(ModelMap map) {
		List<Travel> travels=travelRepository.findAll();
		if(travels.isEmpty()) {
			map.put("message", "no records found");
			return "main.html";
		}
		map.put("travels", travels);
		return "fetch.html";
	}
	@GetMapping("/delete")
	public String removeById(@RequestParam long id,ModelMap map) {
//		System.out.println(id);
		travelRepository.deleteById(id);
		map.put("message", "record deleted");
		
		return fetch(map);
	}
	
	//1
	@GetMapping("/update")
	public String getUpdateForm(@RequestParam long id, ModelMap model) {
		Optional<Travel> o=travelRepository.findById(id);
		//Travel travel=o.get();
		model.put("travel", o.get());
		return "update.html";
	}
	
	
	//2
	@PostMapping("/update")
	public String update(@ModelAttribute Travel travel) {
		travelRepository.save(travel);
		return "redirect:/fetch";
		
		
	}
}
