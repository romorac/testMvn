package com.nisum.test.pruebanisum.model.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * <h1>PhoneDTO.java</h1><br>
 * 
 * @author rmora
 * @since  04-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial.</li>
 *         </ul>
 **/

public class PhoneDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String number;
	private String cityCode;
	private String countryCode;

	public String getNumber() {
		return number;
	}

	@JsonSetter("number")
	public void setNumber(String number) {
		this.number = number;
	}

	public String getCityCode() {
		return cityCode;
	}

	@JsonSetter("citycode")
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	@JsonSetter("countrycode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhoneDTO [number=");
		builder.append(number);
		builder.append(", cityCode=");
		builder.append(cityCode);
		builder.append(", countryCode=");
		builder.append(countryCode);
		builder.append("]");
		return builder.toString();
	}

}
