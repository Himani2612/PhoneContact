package com.example.newphone.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.newphone.model.ContactUs;


@Repository
public class ContactRepo {
	@PersistenceContext
	EntityManager entityManager;
	
	
	public ContactUs findContactUsById(int id) {
		ContactUs instProfile = entityManager.find(ContactUs.class, id);
		return instProfile;
	}
	
	public ContactUs addContactUs(ContactUs profile) {
		entityManager.persist(profile);
		entityManager.flush();
		entityManager.detach(profile);
		return profile;
	}
	
	public ContactUs updateContactUs(ContactUs profile) {
		entityManager.merge(profile);
		entityManager.flush();
		entityManager.detach(profile);
		return profile;
	}
	
	public void deleteContactUs(ContactUs profile) {
		entityManager.remove(profile);
		entityManager.flush();
	}
	
}
