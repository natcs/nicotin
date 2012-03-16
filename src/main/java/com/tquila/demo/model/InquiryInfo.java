package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import java.sql.Time;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: InquiryInfo
 *
 */
@Entity

@IdClass(InquiryInfoPK.class)
public class InquiryInfo implements Serializable {

	   
	@Id
	@Column
	private String PropertyUnitId;   
	@Id
	@Column
	private String InquiryId;
	@Column
	private String RenterId;
	@Column
	private String Comment;
	@Column
	private Time CreateDate;
	@Column
	private int InquirySourceTypeId;
	@Column
	private int Adults;
	@Column
	private int Children;
	@Column
	private Time CheckInDate;
	@Column
	private Time CheckOutDate;
	
	private static final long serialVersionUID = 1L;

	public InquiryInfo() {
		super();
	}   
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
	public String getRenterId() {
		return this.RenterId;
	}

	public void setRenterId(String RenterId) {
		this.RenterId = RenterId;
	}   
	public String getComment() {
		return this.Comment;
	}

	public void setComment(String Comment) {
		this.Comment = Comment;
	}   
	public Time getCreateDate() {
		return this.CreateDate;
	}

	public void setCreateDate(Time CreateDate) {
		this.CreateDate = CreateDate;
	}   
	public int getInquirySourceTypeId() {
		return this.InquirySourceTypeId;
	}

	public void setInquirySourceTypeId(int InquirySourceTypeId) {
		this.InquirySourceTypeId = InquirySourceTypeId;
	}   
	public int getAdults() {
		return this.Adults;
	}

	public void setAdults(int Adults) {
		this.Adults = Adults;
	}   
	public int getChildren() {
		return this.Children;
	}

	public void setChildren(int Children) {
		this.Children = Children;
	}   
	public Time getCheckInDate() {
		return this.CheckInDate;
	}

	public void setCheckInDate(Time CheckInDate) {
		this.CheckInDate = CheckInDate;
	}   
	public Time getCheckOutDate() {
		return this.CheckOutDate;
	}

	public void setCheckOutDate(Time CheckOutDate) {
		this.CheckOutDate = CheckOutDate;
	}
   
}
