package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;

/**
 * ID class for entity: InquiryInfo
 *
 */ 
public class InquiryInfoPK  implements Serializable {   
   
	         
	private String PropertyUnitId;         
	private String InquiryId;
	private static final long serialVersionUID = 1L;

	public InquiryInfoPK() {}

	

	public String getPropertyUnitId() {
		return this.PropertyUnitId;
	}

	public void setPropertyUnitId(String PropertyUnitId) {
		this.PropertyUnitId = PropertyUnitId;
	}
	

	public String getInquiryId() {
		return this.InquiryId;
	}

	public void setInquiryId(String InquiryId) {
		this.InquiryId = InquiryId;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof InquiryInfoPK)) {
			return false;
		}
		InquiryInfoPK other = (InquiryInfoPK) o;
		return true
			&& (getPropertyUnitId() == null ? other.getPropertyUnitId() == null : getPropertyUnitId().equals(other.getPropertyUnitId()))
			&& (getInquiryId() == null ? other.getInquiryId() == null : getInquiryId().equals(other.getInquiryId()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getPropertyUnitId() == null ? 0 : getPropertyUnitId().hashCode());
		result = prime * result + (getInquiryId() == null ? 0 : getInquiryId().hashCode());
		return result;
	}
   
   
}
