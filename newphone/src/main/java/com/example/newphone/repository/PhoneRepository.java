package com.example.newphone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newphone.model.ContactUs;
import com.example.newphone.model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {
	//public Phone findPhoneById(int id);
}
