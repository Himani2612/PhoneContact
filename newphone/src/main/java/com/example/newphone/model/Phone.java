package com.example.newphone.model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Phone {
	@Id
	
	@GeneratedValue
	private int id;
	private String phoneNo;
	
	@ManyToOne(targetEntity = ContactUs.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "contactId_fk",referencedColumnName = "contactId")
	
	ContactUs contactus;
	 @JsonBackReference
	 
	 
	 
	
	public ContactUs getContactus() {
		return contactus;
	}
	public void setContactus(ContactUs contactus) {
		this.contactus = contactus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj==null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Phone other = (Phone)  obj;
		
		if (phoneNo==null) {
			if (other.phoneNo!=null)
				return false;
		}else if (!phoneNo.equals(other.phoneNo)) {
			return false;
		}
		return true;
	}
	
}


