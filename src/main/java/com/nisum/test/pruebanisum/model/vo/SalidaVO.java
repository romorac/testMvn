package com.nisum.test.pruebanisum.model.vo;

import java.io.Serializable;

/**
 * <h1>SalidaVO.java</h1><br>
 * 
 * @author rmora
 * @since  04-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/

public class SalidaVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalidaVO [mensaje=");
		builder.append(mensaje);
		builder.append("]");
		return builder.toString();
	}

}
