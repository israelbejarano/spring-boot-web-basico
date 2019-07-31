package com.ideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideas.springboot.web.app.models.Usuario;

/**
 * The Class IndexController.
 * @author Israel Bejarano
 */
@Controller
@RequestMapping("/app")
public class IndexController {
	
	/** The texto index. */
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	/** The texto perfil. */
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	
	/** The texto listar. */
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;
	
	/**
	 * Index.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index";
	}
	
	/**
	 * Perfil.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Israel");
		usuario.setApellido("Bejarano");
		usuario.setEmail("prueba@prueba.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}
	
	/**
	 * Listar.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}
	
	/**
	 * Rellenar usuarios.
	 *
	 * @return the list
	 */
	@ModelAttribute("usuarios")
	public List<Usuario> rellenarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Israel", "Bejarano", "prueba@prueba.com"));
		usuarios.add(new Usuario("John", "Doe", "prueba@prueba.com"));
		usuarios.add(new Usuario("Rita", "Doe", "prueba@prueba.com"));
		return usuarios;
	}
}