package com.ideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The Class HomeController.
 * @author Israel Bejarano
 */
@Controller
public class HomeController {
	
	/**
	 * Home.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	public String home() {
		return "forward:/app/index";
	}

}
