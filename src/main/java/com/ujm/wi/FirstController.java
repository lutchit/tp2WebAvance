package com.ujm.wi;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	@Inject
	private VegetableRepo vegeRepo;
	
	@RequestMapping(value={"/", "/default"})
	public String returnMySimpleFile(Model model) {
		model.addAttribute("hi", "helloooooo");
		model.addAttribute("veges", vegeRepo.findAll());
		//model.addAttribute("veg", new Vegetable("lentils", "brown", 1.5f));
		
		return "simple";
	}
	
	@RequestMapping(value="/addvege", method=RequestMethod.POST)
	public String addVegetable(Vegetable v) {
		vegeRepo.save(v);
		
		return "redirect:/";
	}
}
