package com.nisum.test.pruebanisum.model.dto;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.sun.istack.NotNull;

/**
 * <h1>Usuario.java</h1><br>
 * 
 * @author rmora
 * @since  04-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/

public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotNull
	private String name;
	@NotNull
	@Pattern(regexp = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+.([a-zA-Z]{2,4})", message = "email con formato no válido.")
	private String email;
	@NotNull
	@Pattern(regexp = "([A-Z]{1}[a-z]*[0-9]{2})", message = "(password sólo acepta Una Mayuscula, letras minúsculas, y dos numeros)")
	private String password;
	private PhonesDTO lstPhones;

	public String getName() {
		return name;
	}

	@JsonSetter("name")
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@JsonSetter("email")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	@JsonSetter("password")
	public void setPassword(String password) {
		this.password = password;
	}

	public PhonesDTO getLstPhones() {
		return lstPhones;
	}

	@JsonSetter("lstPhones")
	public void setLstPhones(PhonesDTO lstPhones) {
		this.lstPhones = lstPhones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioDTO [name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", lstPhones=");
		builder.append(lstPhones);
		builder.append("]");
		return builder.toString();
	}

}
