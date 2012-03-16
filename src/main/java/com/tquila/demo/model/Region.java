package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Region
 *
 */
@Entity

public class Region implements Serializable {

	   
	@Id
	@Column
	private String RegionId;
	@Column
	private int ParentRegionId;
	@Column
	private String Region;
	@Column
	private String RegionUrl;
	@Column
	private String Description;
	@Column
	private String MetaKeywords;
	@Column
	private String MetaDescription;
	@Column
	private int Latitude;
	@Column
	private int Longtitude;
	@Column
	private int ZoomLevel;
	@Column
	private String Title;
	@Column
	private String Wikipedia;
	@Column
	private String FullName;
	@Column
	private String FullPath;
	@Column
	private String LMDPropertyUnitCount;
	
	private static final long serialVersionUID = 1L;

	public Region() {
		super();
	}   
	public String getRegionId() {
		return this.RegionId;
	}

	public void setRegionId(String RegionId) {
		this.RegionId = RegionId;
	}
	/**
	 * @return the parentRegionId
	 */
	public int getParentRegionId() {
		return ParentRegionId;
	}
	/**
	 * @param parentRegionId the parentRegionId to set
	 */
	public void setParentRegionId(int parentRegionId) {
		ParentRegionId = parentRegionId;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return Region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		Region = region;
	}
	/**
	 * @return the regionUrl
	 */
	public String getRegionUrl() {
		return RegionUrl;
	}
	/**
	 * @param regionUrl the regionUrl to set
	 */
	public void setRegionUrl(String regionUrl) {
		RegionUrl = regionUrl;
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
	 * @return the metaKeywords
	 */
	public String getMetaKeywords() {
		return MetaKeywords;
	}
	/**
	 * @param metaKeywords the metaKeywords to set
	 */
	public void setMetaKeywords(String metaKeywords) {
		MetaKeywords = metaKeywords;
	}
	/**
	 * @return the metaDescription
	 */
	public String getMetaDescription() {
		return MetaDescription;
	}
	/**
	 * @param metaDescription the metaDescription to set
	 */
	public void setMetaDescription(String metaDescription) {
		MetaDescription = metaDescription;
	}
	/**
	 * @return the latitude
	 */
	public int getLatitude() {
		return Latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(int latitude) {
		Latitude = latitude;
	}
	/**
	 * @return the longtitude
	 */
	public int getLongtitude() {
		return Longtitude;
	}
	/**
	 * @param longtitude the longtitude to set
	 */
	public void setLongtitude(int longtitude) {
		Longtitude = longtitude;
	}
	/**
	 * @return the zoomLevel
	 */
	public int getZoomLevel() {
		return ZoomLevel;
	}
	/**
	 * @param zoomLevel the zoomLevel to set
	 */
	public void setZoomLevel(int zoomLevel) {
		ZoomLevel = zoomLevel;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}
	/**
	 * @return the wikipedia
	 */
	public String getWikipedia() {
		return Wikipedia;
	}
	/**
	 * @param wikipedia the wikipedia to set
	 */
	public void setWikipedia(String wikipedia) {
		Wikipedia = wikipedia;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return FullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	/**
	 * @return the fullPath
	 */
	public String getFullPath() {
		return FullPath;
	}
	/**
	 * @param fullPath the fullPath to set
	 */
	public void setFullPath(String fullPath) {
		FullPath = fullPath;
	}
	/**
	 * @return the lMDPropertyUnitCount
	 */
	public String getLMDPropertyUnitCount() {
		return LMDPropertyUnitCount;
	}
	/**
	 * @param lMDPropertyUnitCount the lMDPropertyUnitCount to set
	 */
	public void setLMDPropertyUnitCount(String lMDPropertyUnitCount) {
		LMDPropertyUnitCount = lMDPropertyUnitCount;
	}
   
}
