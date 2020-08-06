package com.nisum.test.pruebanisum.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nisum.test.pruebanisum.model.bo.UsuarioBO;

/**
 * <h1>UsuarioDAO.java</h1><br>
 * <b>Descripción: TODO describir el archivo o clase.
 * 
 * @author rmora
 * @since  04-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/

@Repository
public class UsuarioDAO implements UsuarioDAOI {
	@Autowired
	private UsuarioDAOI daoUser;

	@Override
	public <S extends UsuarioBO> S save(S entity) {
		return daoUser.save(entity);
	}

	@Override
	public <S extends UsuarioBO> Iterable<S> saveAll(Iterable<S> entities) {
		return daoUser.saveAll(entities);
	}

	@Override
	public Optional<UsuarioBO> findById(Integer id) {
		return daoUser.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return daoUser.existsById(id);
	}

	@Override
	public Iterable<UsuarioBO> findAll() {
		return daoUser.findAll();
	}

	@Override
	public Iterable<UsuarioBO> findAllById(Iterable<Integer> ids) {
		return daoUser.findAllById(ids);
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		daoUser.deleteById(id);
	}

	@Override
	public void delete(UsuarioBO entity) {
		daoUser.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends UsuarioBO> entities) {
		daoUser.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		daoUser.deleteAll();
	}

}
