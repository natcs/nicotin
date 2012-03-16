package com.tquila.demo.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: NewRental
 *
 */
@Entity

public class NewRental implements Serializable {

	   
	@Id
	@Column
	private String InquiryId;
	@Column
	private String FirstName;
	@Column
	private String LastName;
	@Column
	private String ContactPhoneNumber;
	@Column
	private int CountryId;
	@Column
	private String Email;
	@Column
	private String Password;
	
	private static final long serialVersionUID = 1L;

	public NewRental() {
		super();
	}   
	public String getInquiryId() {
		return this.InquiryId;
	}

	public void setInquiryId(String InquiryId) {
		this.InquiryId = InquiryId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the contactPhoneNumber
	 */
	public String getContactPhoneNumber() {
		return ContactPhoneNumber;
	}
	/**
	 * @param contactPhoneNumber the contactPhoneNumber to set
	 */
	public void setContactPhoneNumber(String contactPhoneNumber) {
		ContactPhoneNumber = contactPhoneNumber;
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
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
   
}
