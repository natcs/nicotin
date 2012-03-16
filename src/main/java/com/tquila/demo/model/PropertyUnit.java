package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PropertyUnit
 *
 */
@Entity

public class PropertyUnit implements Serializable {

	   
	@Id
	@Column
	private String PropertyUnitId;
	@Column
	private String RegionId;
	@Column
	private String PropertyId;
	@Column
	private int CountryId;
	@Column
	private String PropertyName;
	@Column
	private String LongDescription;
	@Column
	private String Address;
	@Column
	private String OtherAmenity;
	@Column
	private String PhoneNumber;
	@Column
	private String FaxNumber;
	@Column
	private String Direction;
	@Column
	private String MapDocument;
	@Column
	private int PropertyNo;
	@Column
	private String Currency;
	@Column
	private String UnitName;
	@Column
	private String UnitDescription;
	@Column
	private int Bedroom;
	@Column
	private int Bathroom;
	@Column
	private int MaxOccupency;
	@Column
	private String UnitOtherAmenity;
	@Column
	private String BuildingType;
	@Column
	private String BedSize;
	@Column
	private int UnitNo;
	@Column
	private String UnitShortDescription;
	@Column
	private String MinPrice;
	@Column
	private String MaxPrice;

	
	
	private static final long serialVersionUID = 1L;

	public PropertyUnit() {
		super();
	}   
	public String getPropertyUnitId() {
		return this.PropertyUnitId;
	}

	public void setPropertyUnitId(String PropertyUnitId) {
		this.PropertyUnitId = PropertyUnitId;
	}   
	public String getRegionId() {
		return this.RegionId;
	}

	public void setRegionId(String RegionId) {
		this.RegionId = RegionId;
	}
	/**
	 * @return the propertyId
	 */
	public String getPropertyId() {
		return PropertyId;
	}
	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(String propertyId) {
		PropertyId = propertyId;
	}
	/**
	 * @return the countryId
	 */
	public int getCountryId() {
		return CountryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(int countryId) {
		CountryId = countryId;
	}
	/**
	 * @return the propertyName
	 */
	public String getPropertyName() {
		return PropertyName;
	}
	/**
	 * @param propertyName the propertyName to set
	 */
	public void setPropertyName(String propertyName) {
		PropertyName = propertyName;
	}
	/**
	 * @return the longDescription
	 */
	public String getLongDescription() {
		return LongDescription;
	}
	/**
	 * @param longDescription the longDescription to set
	 */
	public void setLongDescription(String longDescription) {
		LongDescription = longDescription;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the otherAmenity
	 */
	public String getOtherAmenity() {
		return OtherAmenity;
	}
	/**
	 * @param otherAmenity the otherAmenity to set
	 */
	public void setOtherAmenity(String otherAmenity) {
		OtherAmenity = otherAmenity;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	/**
	 * @return the faxNumber
	 */
	public String getFaxNumber() {
		return FaxNumber;
	}
	/**
	 * @param faxNumber the faxNumber to set
	 */
	public void setFaxNumber(String faxNumber) {
		FaxNumber = faxNumber;
	}
	/**
	 * @return the direction
	 */
	public String getDirection() {
		return Direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		Direction = direction;
	}
	/**
	 * @return the mapDocument
	 */
	public String getMapDocument() {
		return MapDocument;
	}
	/**
	 * @param mapDocument the mapDocument to set
	 */
	public void setMapDocument(String mapDocument) {
		MapDocument = mapDocument;
	}
	/**
	 * @return the propertyNo
	 */
	public int getPropertyNo() {
		return PropertyNo;
	}
	/**
	 * @param propertyNo the propertyNo to set
	 */
	public void setPropertyNo(int propertyNo) {
		PropertyNo = propertyNo;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return Currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		Currency = currency;
	}
	/**
	 * @return the unitName
	 */
	public String getUnitName() {
		return UnitName;
	}
	/**
	 * @param unitName the unitName to set
	 */
	public void setUnitName(String unitName) {
		UnitName = unitName;
	}
	/**
	 * @return the unitDescription
	 */
	public String getUnitDescription() {
		return UnitDescription;
	}
	/**
	 * @param unitDescription the unitDescription to set
	 */
	public void setUnitDescription(String unitDescription) {
		UnitDescription = unitDescription;
	}
	/**
	 * @return the bedroom
	 */
	public int getBedroom() {
		return Bedroom;
	}
	/**
	 * @param bedroom the bedroom to set
	 */
	public void setBedroom(int bedroom) {
		Bedroom = bedroom;
	}
	/**
	 * @return the bathroom
	 */
	public int getBathroom() {
		return Bathroom;
	}
	/**
	 * @param bathroom the bathroom to set
	 */
	public void setBathroom(int bathroom) {
		Bathroom = bathroom;
	}
	/**
	 * @return the maxOccupency
	 */
	public int getMaxOccupency() {
		return MaxOccupency;
	}
	/**
	 * @param maxOccupency the maxOccupency to set
	 */
	public void setMaxOccupency(int maxOccupency) {
		MaxOccupency = maxOccupency;
	}
	/**
	 * @return the unitOtherAmenity
	 */
	public String getUnitOtherAmenity() {
		return UnitOtherAmenity;
	}
	/**
	 * @param unitOtherAmenity the unitOtherAmenity to set
	 */
	public void setUnitOtherAmenity(String unitOtherAmenity) {
		UnitOtherAmenity = unitOtherAmenity;
	}
	/**
	 * @return the buildingType
	 */
	public String getBuildingType() {
		return BuildingType;
	}
	/**
	 * @param buildingType the buildingType to set
	 */
	public void setBuildingType(String buildingType) {
		BuildingType = buildingType;
	}
	/**
	 * @return the bedSize
	 */
	public String getBedSize() {
		return BedSize;
	}
	/**
	 * @param bedSize the bedSize to set
	 */
	public void setBedSize(String bedSize) {
		BedSize = bedSize;
	}
	/**
	 * @return the unitNo
	 */
	public int getUnitNo() {
		return UnitNo;
	}
	/**
	 * @param unitNo the unitNo to set
	 */
	public void setUnitNo(int unitNo) {
		UnitNo = unitNo;
	}
	/**
	 * @return the unitShortDescription
	 */
	public String getUnitShortDescription() {
		return UnitShortDescription;
	}
	/**
	 * @param unitShortDescription the unitShortDescription to set
	 */
	public void setUnitShortDescription(String unitShortDescription) {
		UnitShortDescription = unitShortDescription;
	}
	/**
	 * @return the minPrice
	 */
	public String getMinPrice() {
		return MinPrice;
	}
	/**
	 * @param minPrice the minPrice to set
	 */
	public void setMinPrice(String minPrice) {
		MinPrice = minPrice;
	}
	/**
	 * @return the maxPrice
	 */
	public String getMaxPrice() {
		return MaxPrice;
	}
	/**
	 * @param maxPrice the maxPrice to set
	 */
	public void setMaxPrice(String maxPrice) {
		MaxPrice = maxPrice;
	}
   
}
