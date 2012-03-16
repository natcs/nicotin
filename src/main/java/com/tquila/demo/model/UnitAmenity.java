package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UnitAmenity
 *
 */
@Entity

public class UnitAmenity implements Serializable {

	   
	@Id
	@Column
	private String UnitId;
	@Column
	private String AmenityId;
	private static final long serialVersionUID = 1L;

	public UnitAmenity() {
		super();
	}   
	public String getUnitId() {
		return this.UnitId;
	}

	public void setUnitId(String UnitId) {
		this.UnitId = UnitId;
	}   
	public String getAmenityId() {
		return this.AmenityId;
	}

	public void setAmenityId(String AmenityId) {
		this.AmenityId = AmenityId;
	}
   
}
