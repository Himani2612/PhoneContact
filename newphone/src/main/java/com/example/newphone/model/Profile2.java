package com.example.newphone.model;

import java.sql.Timestamp;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
public class Profile2 {
	@Id
	@GeneratedValue
private long id;
private long activetemplateid; 
private long theme_id; 
private String institutionname; 
@CreationTimestamp
private Timestamp created_on  ;
@UpdateTimestamp
private Timestamp updated_on ;
@JsonManagedReference
@OneToOne(mappedBy = "profile",cascade = CascadeType.ALL)
ProfileDetail profiledetails;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getActivetemplateid() {
	return activetemplateid;
}
public void setActivetemplateid(long activetemplateid) {
	this.activetemplateid = activetemplateid;
}
public long getTheme_id() {
	return theme_id;
}
public void setTheme_id(long theme_id) {
	this.theme_id = theme_id;
}
public String getInstitutionname() {
	return institutionname;
}
public void setInstitutionname(String institutionname) {
	this.institutionname = institutionname;
}
public Timestamp getCreated_on() {
	return created_on;
}
public void setCreated_on(Timestamp created_on) {
	this.created_on = created_on;
}
public Timestamp getUpdated_on() {
	return updated_on;
}
public void setUpdated_on(Timestamp updated_on) {
	this.updated_on = updated_on;
}
public ProfileDetail getProfiledetails() {
	return profiledetails;
}
public void setProfiledetails(ProfileDetail profiledetails) {
	this.profiledetails = profiledetails;
}


@OneToOne(mappedBy = "profile",cascade = CascadeType.ALL)
ContactUs contactus;
public ContactUs getContactus() {
	return contactus;
}
public void setContactus(ContactUs contactus) {
	this.contactus = contactus;
}


}
