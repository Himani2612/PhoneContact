package com.example.newphone.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.newphone.model.ContactUs;




@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Integer>{

	
	
}
