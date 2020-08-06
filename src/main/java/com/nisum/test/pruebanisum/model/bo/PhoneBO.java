package com.nisum.test.pruebanisum.model.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <h1>PhoneBO.java</h1><br>
 * 
 * @author rmora
 * @since  04-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/
@Entity
public class PhoneBO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String number;
	private String cityCode;
	private String countryCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhoneBO [id=");
		builder.append(id);
		builder.append(", number=");
		builder.append(number);
		builder.append(", cityCode=");
		builder.append(cityCode);
		builder.append(", countryCode=");
		builder.append(countryCode);
		builder.append("]");
		return builder.toString();
	}

}
