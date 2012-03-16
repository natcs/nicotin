package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Country
 *
 */
@Entity

public class Country implements Serializable {

	   
	@Id
	@Column
	private int CountryId;
	@Column
	private String CountryName;
	private static final long serialVersionUID = 1L;

	public Country() {
		super();
	}   
	public int getCountryId() {
		return this.CountryId;
	}

	public void setCountryId(int CountryId) {
		this.CountryId = CountryId;
	}   
	public String getCountryName() {
		return this.CountryName;
	}

	public void setCountryName(String CountryName) {
		this.CountryName = CountryName;
	}
   
}
