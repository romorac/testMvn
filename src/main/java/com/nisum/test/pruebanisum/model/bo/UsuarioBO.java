package com.nisum.test.pruebanisum.model.bo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * <h1>UsuarioBO.java</h1><br>
 * 
 * @author rmora
 * @since  04-08-2020</br>
 *         <b>historial de cambios</b>
 *         <ul>
 *         <li>[rmora]inicial</li>
 *         </ul>
 **/

@Entity
public class UsuarioBO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	@Column(unique = true)
	private String email;
	private String password;
	private Date created;
	private Date modified;
	private Date lastLogin;
	private String token;
	private boolean active;
	@OneToMany(targetEntity = PhoneBO.class, cascade = { CascadeType.ALL })
	private List<PhoneBO> lstPhones;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<PhoneBO> getLstPhones() {
		if (null == lstPhones) {
			lstPhones = new ArrayList<PhoneBO>();
		}
		return lstPhones;
	}

	public void setLstPhones(List<PhoneBO> lstPhones) {
		this.lstPhones = lstPhones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioBO [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", created=");
		builder.append(created);
		builder.append(", modified=");
		builder.append(modified);
		builder.append(", lastLogin=");
		builder.append(lastLogin);
		builder.append(", token=");
		builder.append(token);
		builder.append(", active=");
		builder.append(active);
		builder.append(", lstPhones=");
		builder.append(lstPhones);
		builder.append("]");
		return builder.toString();
	}

}
