package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;

/**
 * ID class for entity: Pics
 *
 */ 
public class PicsPK  implements Serializable {   
   
	         
	private String PropertyUnitId;         
	private String PicId;
	private static final long serialVersionUID = 1L;

	public PicsPK() {}

	

	public String getPropertyUnitId() {
		return this.PropertyUnitId;
	}

	public void setPropertyUnitId(String PropertyUnitId) {
		this.PropertyUnitId = PropertyUnitId;
	}
	

	public String getPicId() {
		return this.PicId;
	}

	public void setPicId(String PicId) {
		this.PicId = PicId;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof PicsPK)) {
			return false;
		}
		PicsPK other = (PicsPK) o;
		return true
			&& (getPropertyUnitId() == null ? other.getPropertyUnitId() == null : getPropertyUnitId().equals(other.getPropertyUnitId()))
			&& (getPicId() == null ? other.getPicId() == null : getPicId().equals(other.getPicId()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getPropertyUnitId() == null ? 0 : getPropertyUnitId().hashCode());
		result = prime * result + (getPicId() == null ? 0 : getPicId().hashCode());
		return result;
	}
   
   
}
