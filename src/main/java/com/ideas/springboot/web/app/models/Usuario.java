package com.ideas.springboot.web.app.models;

/**
 * The Class Usuario.
 * @author Israel Bejarano
 */
public class Usuario {
	
	/** The nombre. */
	private String nombre;
	
	/** The apellido. */
	private String apellido;
	
	/** The email. */
	private String email;
	
	/**
	 * Instantiates a new usuario.
	 */
	public Usuario() {

	}

	/**
	 * Instantiates a new usuario.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param email the email
	 */
	public Usuario(String nombre, String apellido, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the apellido.
	 *
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Sets the apellido.
	 *
	 * @param apellido the new apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}