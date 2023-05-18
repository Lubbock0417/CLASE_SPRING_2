package com.cibertec.edu.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.edu.models.Personal;
import com.cibertec.edu.services.PersonalService;

@Controller
@RequestMapping("/home")
public class PersonalController {
	
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
	private PersonalService personalService;
	
	@GetMapping({"/index", "/","","/home"})
	public String index(Model model) {
		String title = "Hello World!";
		model.addAttribute("titulo",title);
		
		Personal personalObj = this.personalService.getOnePersonal(1);
		
		model.addAttribute("personal",personalObj);
		
		logger.info("Objeto recuperado con exito!");
		return "index";
	}

}
