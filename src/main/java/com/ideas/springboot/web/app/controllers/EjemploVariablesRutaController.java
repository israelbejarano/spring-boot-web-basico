package com.ideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class EjemploVariablesRutaController.
 * @author Israel Bejarano Alvarez
 */
@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
	
	/**
	 * Index.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Recibir parametros de la ruta (PathVariable)");
		return "variables/index";
	}
	
	/**
	 * Variables.
	 *
	 * @param texto the texto
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/string/{texto}")
	public String variables(@PathVariable(name="texto") String texto, Model model) {
		model.addAttribute("titulo", "Recibir parametros de la ruta (PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " + texto);
		return "variables/ver";		
	}
	
	/**
	 * Variables.
	 *
	 * @param texto the texto
	 * @param numero the numero
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/string/{texto}/{numero}")
	public String variables(@PathVariable(name="texto") String texto, @PathVariable(name="numero") Integer numero, Model model) {
		model.addAttribute("titulo", "Recibir parametros de la ruta (PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " + texto + " y el numero enviado en la ruta es: "
							+ Integer.toString(numero));
		return "variables/ver";		
	}
}