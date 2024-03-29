package com.ideas.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The Class EjemploParamsController.
 * @author Israel Bejarano
 */
@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	/**
	 * Index.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Enviar parametros del Request HTTP GET - URL");
		return "params/index";
	}
	
	/**
	 * Param.
	 *
	 * @param texto the texto
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/string")
	public String param(@RequestParam(name="texto", required = false, defaultValue = "parametro por defecto") String texto, Model model) {
		model.addAttribute("resultado", "el parametro recibido es: " + texto);
		model.addAttribute("titulo", "Recibir parametros del Request HTTP GET - URL");
		return "params/ver";
	}
	
	/**
	 * Param.
	 *
	 * @param saludo the saludo
	 * @param numero the numero
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		model.addAttribute("resultado", "el saludo enviado es: '" + saludo + "' y el numero es '" + numero + "'");
		model.addAttribute("titulo", "Recibir parametros del Request HTTP GET - URL");
		return "params/ver";
	}
	
	/**
	 * Param.
	 *
	 * @param request the request
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		String saludo = "";
		Integer numero = null;
		try {
			saludo = request.getParameter("saludo");
			numero = Integer.parseInt(request.getParameter("numero"));
		}catch (NumberFormatException e){
			numero = 0;
		}
		model.addAttribute("resultado", "el saludo enviado es: '" + saludo + "' y el numero es '" + numero + "'");
		model.addAttribute("titulo", "Recibir parametros del Request HTTP GET - URL");
		return "params/ver";
	}	
}