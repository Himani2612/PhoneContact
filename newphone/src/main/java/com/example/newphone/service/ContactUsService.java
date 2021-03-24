package com.example.newphone.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.newphone.model.ContactUs;
import com.example.newphone.model.Phone;
import com.example.newphone.repository.ContactRepo;
import com.example.newphone.repository.PhoneRepository;

@Service
public class ContactUsService {
@Autowired
ContactRepo contactrepo;
//@Autowired
PhoneRepository phonerepo;
public ContactUs getContact(int id){
	return contactrepo.findContactUsById(id);
}
//public Phone getPhones(int id)
//{
	//return phonerepo.findPhoneById(id);
//}
public Phone getphone(int id)
{
	Phone u=phonerepo.findById(id).get();
	u.setContactus(null);;
	return u;
}
}
