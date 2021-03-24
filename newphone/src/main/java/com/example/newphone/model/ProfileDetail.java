package com.example.newphone.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class ProfileDetail {
	@Id
	@GeneratedValue
	private long id;
	private String aboutUs;
	private Long noOfBed;
	private Long icuBed;
	private boolean pathLab;
	private boolean trumaFacility;
	private boolean infectiousDiseaseFacility;
	private boolean psychiatricFacility;
	private boolean ambulanceFacility;
	private String websiteAddress;
	private String status;
	private String bannerUrl;
	@JsonBackReference
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="instId")
	private Profile2 profile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAboutUs() {
		return aboutUs;
	}
	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}
	public Long getNoOfBed() {
		return noOfBed;
	}
	public void setNoOfBed(Long noOfBed) {
		this.noOfBed = noOfBed;
	}
	public Long getIcuBed() {
		return icuBed;
	}
	public void setIcuBed(Long icuBed) {
		this.icuBed = icuBed;
	}
	public boolean isPathLab() {
		return pathLab;
	}
	public void setPathLab(boolean pathLab) {
		this.pathLab = pathLab;
	}
	public boolean isTrumaFacility() {
		return trumaFacility;
	}
	public void setTrumaFacility(boolean trumaFacility) {
		this.trumaFacility = trumaFacility;
	}
	public boolean isInfectiousDiseaseFacility() {
		return infectiousDiseaseFacility;
	}
	public void setInfectiousDiseaseFacility(boolean infectiousDiseaseFacility) {
		this.infectiousDiseaseFacility = infectiousDiseaseFacility;
	}
	public boolean isPsychiatricFacility() {
		return psychiatricFacility;
	}
	public void setPsychiatricFacility(boolean psychiatricFacility) {
		this.psychiatricFacility = psychiatricFacility;
	}
	public boolean isAmbulanceFacility() {
		return ambulanceFacility;
	}
	public void setAmbulanceFacility(boolean ambulanceFacility) {
		this.ambulanceFacility = ambulanceFacility;
	}
	public String getWebsiteAddress() {
		return websiteAddress;
	}
	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBannerUrl() {
		return bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	public Profile2 getProfile() {
		return profile;
	}
	public void setProfile(Profile2 profile) {
		this.profile = profile;
	}
	
}
