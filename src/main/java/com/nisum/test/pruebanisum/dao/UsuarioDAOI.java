package com.nisum.test.pruebanisum.dao;

import org.springframework.data.repository.CrudRepository;

import com.nisum.test.pruebanisum.model.bo.UsuarioBO;

/**
 * <h1>UsuarioDAOI.java</h1><br>
 * <b>Descripción: TODO describir el archivo o clase.
 * 
 * @author rmora
 * @since  05-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/

public interface UsuarioDAOI extends CrudRepository<UsuarioBO, Integer> {

}
