package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import java.sql.Time;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PropertyUnitAvailability
 *
 */
@Entity

public class PropertyUnitAvailability implements Serializable {

	   
	@Id
	@Column
	private String PropertyUnitId;
	@Column
	private Time StoreDate;
	@Column
	private int IsReServe;
	@Column
	private int NightlyRate;
	@Column
	private int OriginalRate;
	@Column
	private int MinNight;
	@Column
	private String ToolTipText;
	@Column
	private boolean IsHoliday;
	@Column
	private int PriceRangeId;
	@Column
	private int DiscountPercentage;
	
	
	private static final long serialVersionUID = 1L;

	public PropertyUnitAvailability() {
		super();
	}   
	public String getPropertyUnitId() {
		return this.PropertyUnitId;
	}

	public void setPropertyUnitId(String PropertyUnitId) {
		this.PropertyUnitId = PropertyUnitId;
	}
	/**
	 * @return the storeDate
	 */
	public Time getStoreDate() {
		return StoreDate;
	}
	/**
	 * @param storeDate the storeDate to set
	 */
	public void setStoreDate(Time storeDate) {
		StoreDate = storeDate;
	}
	/**
	 * @return the isReServe
	 */
	public int getIsReServe() {
		return IsReServe;
	}
	/**
	 * @param isReServe the isReServe to set
	 */
	public void setIsReServe(int isReServe) {
		IsReServe = isReServe;
	}
	/**
	 * @return the nightlyRate
	 */
	public int getNightlyRate() {
		return NightlyRate;
	}
	/**
	 * @param nightlyRate the nightlyRate to set
	 */
	public void setNightlyRate(int nightlyRate) {
		NightlyRate = nightlyRate;
	}
	/**
	 * @return the originalRate
	 */
	public int getOriginalRate() {
		return OriginalRate;
	}
	/**
	 * @param originalRate the originalRate to set
	 */
	public void setOriginalRate(int originalRate) {
		OriginalRate = originalRate;
	}
	/**
	 * @return the minNight
	 */
	public int getMinNight() {
		return MinNight;
	}
	/**
	 * @param minNight the minNight to set
	 */
	public void setMinNight(int minNight) {
		MinNight = minNight;
	}
	/**
	 * @return the toolTipText
	 */
	public String getToolTipText() {
		return ToolTipText;
	}
	/**
	 * @param toolTipText the toolTipText to set
	 */
	public void setToolTipText(String toolTipText) {
		ToolTipText = toolTipText;
	}
	/**
	 * @return the isHoliday
	 */
	public boolean isIsHoliday() {
		return IsHoliday;
	}
	/**
	 * @param isHoliday the isHoliday to set
	 */
	public void setIsHoliday(boolean isHoliday) {
		IsHoliday = isHoliday;
	}
	/**
	 * @return the priceRangeId
	 */
	public int getPriceRangeId() {
		return PriceRangeId;
	}
	/**
	 * @param priceRangeId the priceRangeId to set
	 */
	public void setPriceRangeId(int priceRangeId) {
		PriceRangeId = priceRangeId;
	}
	/**
	 * @return the discountPercentage
	 */
	public int getDiscountPercentage() {
		return DiscountPercentage;
	}
	/**
	 * @param discountPercentage the discountPercentage to set
	 */
	public void setDiscountPercentage(int discountPercentage) {
		DiscountPercentage = discountPercentage;
	}
   
}
