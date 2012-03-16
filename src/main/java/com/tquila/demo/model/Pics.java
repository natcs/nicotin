package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pics
 *
 */
@Entity

@IdClass(PicsPK.class)
public class Pics implements Serializable {

	   
	@Id
	@Column
	private String PropertyUnitId;   
	@Id
	@Column
	private String PicId;
	@Column
	private String Title;
	@Column
	private String Path;
	@Column
	private String Filename;
	@Column
	private String ThumbnailPath;
	@Column
	private String ThumbnailFilename;
	@Column
	private int width;
	@Column
	private int Height;
	@Column
	private int SortOrder;
	
	private static final long serialVersionUID = 1L;

	public Pics() {
		super();
	}   
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
	 * @return the path
	 */
	public String getPath() {
		return Path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		Path = path;
	}
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return Filename;
	}
	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		Filename = filename;
	}
	/**
	 * @return the thumbnailPath
	 */
	public String getThumbnailPath() {
		return ThumbnailPath;
	}
	/**
	 * @param thumbnailPath the thumbnailPath to set
	 */
	public void setThumbnailPath(String thumbnailPath) {
		ThumbnailPath = thumbnailPath;
	}
	/**
	 * @return the thumbnailFilename
	 */
	public String getThumbnailFilename() {
		return ThumbnailFilename;
	}
	/**
	 * @param thumbnailFilename the thumbnailFilename to set
	 */
	public void setThumbnailFilename(String thumbnailFilename) {
		ThumbnailFilename = thumbnailFilename;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return Height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		Height = height;
	}
	/**
	 * @return the sortOrder
	 */
	public int getSortOrder() {
		return SortOrder;
	}
	/**
	 * @param sortOrder the sortOrder to set
	 */
	public void setSortOrder(int sortOrder) {
		SortOrder = sortOrder;
	}
   
}
