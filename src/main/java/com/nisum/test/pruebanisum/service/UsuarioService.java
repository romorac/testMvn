package com.nisum.test.pruebanisum.service;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.test.pruebanisum.controller.UsuarioController;
import com.nisum.test.pruebanisum.model.bo.UsuarioBO;
import com.nisum.test.pruebanisum.model.dto.UsuarioDTO;
import com.nisum.test.pruebanisum.model.vo.SalidaVO;

/**
 * <h1>UsuarioService.java</h1><br>
 * 
 * @author rmora
 * @since  04-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/
@RestController
@RequestMapping("/user")
public class UsuarioService {
	static final Logger log = Logger.getLogger(UsuarioService.class);

	@Autowired
	private UsuarioController srvUsuario;

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public UsuarioBO addUsuario(@Validated @RequestBody UsuarioDTO request) {
		log.info("add--------------" + request);
		UsuarioBO salida = null;
		salida = srvUsuario.add(request);
		return salida;
	}

	@RequestMapping(path = "/update/{id}", method = RequestMethod.PUT)
	public UsuarioBO editUsuario(@PathVariable Integer id, @RequestBody @Valid UsuarioDTO request) {
		UsuarioBO salida = null;
		salida = srvUsuario.edit(id, request);
		return salida;
	}

	@RequestMapping(path = "/del/{id}", method = RequestMethod.DELETE)
	public SalidaVO deleteUsuario(@PathVariable Integer id) {
		SalidaVO salida = null;
		salida = srvUsuario.delete(id);
		return salida;
	}

	@RequestMapping(path = "/show/{id}", method = RequestMethod.GET)
	public UsuarioBO showUsuario(@PathVariable Integer id) {
		return srvUsuario.show(id);
	}

}
