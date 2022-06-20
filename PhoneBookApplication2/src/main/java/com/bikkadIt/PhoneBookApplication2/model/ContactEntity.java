package com.bikkadIt.PhoneBookApplication2.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ContactEntity")
public class ContactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ContactId")
	private Integer contactId;
	@Column(name="contactName")
	private String contactName;
	@Column(name="contactNumber")
	private String contactNumber;
	@Column(name="contactEmail")
	private String contactEmail;
	@Column(name="activeswitch")
	private Character activeswitch;
	
	private LocalDate createdDate;
	private LocalDate updatedDate;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Character getActiveswitch() {
		return activeswitch;
	}
	public void setActiveswitch(Character activeswitch) {
		this.activeswitch = activeswitch;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "ContactEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber="
				+ contactNumber + ", contactEmail=" + contactEmail + ", activeswitch=" + activeswitch + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}
	public ContactEntity(Integer contactId, String contactName, String contactNumber, String contactEmail,
			Character activeswitch, LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.contactEmail = contactEmail;
		this.activeswitch = activeswitch;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	
	
}
