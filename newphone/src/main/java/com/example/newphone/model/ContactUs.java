package com.example.newphone.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class ContactUs {

	@Id
	@GeneratedValue
	private int contactId;
	private String email;
	private String addressline1;
	
	@OneToMany(targetEntity = Phone.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "contactId_fk",referencedColumnName = "contactId")
	@JsonManagedReference
	
	private List<Phone> phones;
	
	@Override
	public String toString() {
		return "ContactUs [contactId=" + contactId + ", email=" + email + ", addressline1=" + addressline1 + ", phones="
				+ phones + "]";
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	@JsonBackReference
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="instId")
	private Profile2 profile;

	public Profile2 getProfile() {
		return profile;
	}
	public void setProfile(Profile2 profile) {
		this.profile = profile;
	}
	
	
	
}
