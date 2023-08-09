package com.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.websocket.server.PathParam;

@Controller
public class MvcController {
	
	@GetMapping("/greet")
	public String greeting(
			@PathParam("name") String name,
			Model model
			){
		model.addAttribute("name",name);
		return "greetingpage";
	}
	
	
	@PostMapping("/submitted")
	public String submitted(
			@RequestParam(name="username") String username,
			@RequestParam(name="password") String password,
			Model model
			) {
		model.addAttribute("uname",username);
		model.addAttribute("pass",password);
		return "loggedin";
		
	}
	

}
