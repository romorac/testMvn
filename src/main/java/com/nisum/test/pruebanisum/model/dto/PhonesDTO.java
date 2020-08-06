package com.nisum.test.pruebanisum.model.dto;

import java.io.Serializable;
import java.util.List;

/**
 * <h1>PhonesDTO.java</h1><br>
 * 
 * @author rmora
 * @since  05-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/
public class PhonesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<PhoneDTO> phones;

	public List<PhoneDTO> getPhones() {
		return phones;
	}

	public void setPhones(List<PhoneDTO> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhonesDTO [phones=");
		builder.append(phones);
		builder.append("]");
		return builder.toString();
	}

}
