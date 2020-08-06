package com.nisum.test.pruebanisum.controller;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nisum.test.pruebanisum.dao.UsuarioDAO;
import com.nisum.test.pruebanisum.model.bo.PhoneBO;
import com.nisum.test.pruebanisum.model.bo.UsuarioBO;
import com.nisum.test.pruebanisum.model.dto.PhoneDTO;
import com.nisum.test.pruebanisum.model.dto.UsuarioDTO;
import com.nisum.test.pruebanisum.model.vo.SalidaVO;

/**
 * <h1>UsuarioController.java</h1><br>
 * 
 * @author rmora
 * @since  04-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/
@Controller
public class UsuarioController {
	static final Logger log = Logger.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioDAO daoUsuario;

	/**
	 * @since          04-08-2020
	 * @author         rmora
	 * @param  request <?>
	 * @return         <?> response
	 *                 <ul>
	 *                 <li>[rmora]-{0.0.0} inicial</li>
	 *                 </ul>
	 **/
	public UsuarioBO add(UsuarioDTO request) {
		UsuarioBO data = dtoToBO(request);
		System.out.println("bo " + data);
		try {
			data = daoUsuario.save(data);
		} catch (Exception e) {
			log.error("ESTA REPETIDO" + e.getMessage());
			return data;
		}
		return data;
	}

	/**
	 * @since          04-08-2020
	 * @author         rmora
	 * @param  id
	 * @param  request <?>
	 * @return         <?> response
	 *                 <ul>
	 *                 <li>[rmora]-{0.0.0} inicial</li>
	 *                 </ul>
	 **/
	public UsuarioBO edit(Integer id, UsuarioDTO request) {
		UsuarioBO data = dtoToBO(request);
		data.setId(id);
		data.setModified(new java.sql.Date(new Date().getTime()));
		data = daoUsuario.save(data);
		return data;
	}

	/**
	 * @since     04-08-2020
	 * @author    rmora
	 * @param  id <?>
	 * @return    <?> response
	 *            <ul>
	 *            <li>[rmora]-{0.0.0} inicial</li>
	 *            </ul>
	 **/
	public SalidaVO delete(Integer id) {
		SalidaVO salida = new SalidaVO();
		salida.setMensaje("usuario eliminado con el id " + id);
		daoUsuario.deleteById(id);
		return salida;
	}

	/**
	 * @since          05-08-2020
	 * @author         rmora
	 * @param  request <?>
	 * @return         <?> response
	 *                 <ul>
	 *                 <li>[rmora]-{0.0.0} inicial</li>
	 *                 </ul>
	 **/
	public UsuarioBO show(Integer id) {
		UsuarioBO salida = null;
		Optional<UsuarioBO> salidaa = daoUsuario.findById(id);

		if (salidaa.isPresent()) {
			salida = salidaa.get();
		} else {
			return new UsuarioBO();
		}
		return salida;
	}

	/**
	 * @since          04-08-2020
	 * @author         rmora
	 * @param  request <?>
	 * @return         <?> response
	 *                 <ul>
	 *                 <li>[rmora]-{0.0.0} inicial</li>
	 *                 </ul>
	 **/
	private UsuarioBO dtoToBO(UsuarioDTO request) {
		UsuarioBO salida = new UsuarioBO();
		salida.setEmail(request.getEmail());
		salida.setName(request.getName());
		salida.setPassword(request.getPassword());
		salida.setLastLogin(new java.sql.Date(new Date().getTime()));
		salida.setCreated(new java.sql.Date(new Date().getTime()));
		salida.setModified(new java.sql.Date(new Date().getTime()));
		salida.setActive(true);
		salida.setToken(randomToken());

		PhoneBO e;
		for (PhoneDTO it : request.getLstPhones().getPhones()) {
			e = new PhoneBO();
			e.setCityCode(it.getCityCode());
			e.setCountryCode(it.getCountryCode());
			e.setNumber(it.getNumber());
			salida.getLstPhones().add(e);
		}
		return salida;
	}

	private String randomToken() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();

		System.out.println(generatedString);
		return generatedString;
	}
}
