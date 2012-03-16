package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Amenity
 *
 */
/**
 * @author sutee
 * 
 */
@Entity
public class Amenity implements Serializable {

	@Id
	@Column
	private String AmenityId;
	@Column
	private String Amenity;
	@Column
	private String Description;
	
	private int SortBy;
	
	private static final long serialVersionUID = 1L;

	public Amenity() {
		super();
	}

	public String getAmenityId() {
		return this.AmenityId;
	}

	public void setAmenityId(String AmenityId) {
		this.AmenityId = AmenityId;

	}

	/**
	 * @return the amenity
	 */
	public String getAmenity() {
		return Amenity;
	}

	/**
	 * @param amenity the amenity to set
	 */
	public void setAmenity(String amenity) {
		Amenity = amenity;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * @return the sortBy
	 */
	public int getSortBy() {
		return SortBy;
	}

	/**
	 * @param sortBy the sortBy to set
	 */
	public void setSortBy(int sortBy) {
		SortBy = sortBy;
	}

}
