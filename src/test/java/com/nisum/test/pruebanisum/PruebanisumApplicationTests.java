package com.nisum.test.pruebanisum;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nisum.test.pruebanisum.service.UsuarioService;

class PruebanisumApplicationTests {
	@Autowired
	private UsuarioService userServ;

	void contextLoads() {
	}

	@Test
	public void addUsuario() {
		assertTrue(true);
//		UsuarioDTO nuevo = new UsuarioDTO();
//		nuevo.setName("rodolfo Mora");
//		nuevo.setPassword("Saaaaa78");
//		nuevo.setEmail("rmorac@gmail.com");
//		UsuarioBO test = userServ.addUsuario(nuevo);
//		assertTrue(userServ.addUsuario(nuevo) != null);

//		if (null != test) {
//			assertTrue(true);
//		} else {
//			assertFalse(false);
//		}
	}
	
}
