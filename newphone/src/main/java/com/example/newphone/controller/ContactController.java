package com.example.newphone.controller;


import java.lang.reflect.InvocationTargetException;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.newphone.model.ContactUs;
import com.example.newphone.model.Phone;
import com.example.newphone.model.Profile2;
import com.example.newphone.model.ProfileDetail;
import com.example.newphone.repository.ContactRepo;
import com.example.newphone.repository.ContactUsRepository;
import com.example.newphone.repository.PhoneRepository;
import com.example.newphone.repository.ProfileDetailRepo;
import com.example.newphone.repository.ProfileRepo;
import com.example.newphone.service.ContactUsService;
import com.example.newphone.service.ProfileService;
import com.example.newphone.util.NullAwareBeanUtilsBean;


@RestController
public class ContactController {
@Autowired
ContactUsService contactusservice;
@Autowired
ContactUsRepository contactusrepository;
@Autowired
PhoneRepository phonerepository;
@Autowired
ContactRepo contactrepo;
@Autowired
ProfileRepo profilerepo;
@Autowired
ProfileDetailRepo profiledetail;
@Autowired
ProfileService profileservice;

@GetMapping("/contactonetomany/{id}")
public ContactUs getProfile(@PathVariable("id") int id){
	
	ContactUs p=contactusservice.getContact(id);
	return p;
}
@PostMapping("/contactsonetomany")
public ContactUs createPost(@RequestBody ContactUs contactus) {
    return contactusrepository.save(contactus);
}
@Transactional
@PutMapping("/updatecontactonetomany/{id}")
public ContactUs updatecontact(@RequestBody ContactUs contactus,@PathVariable("id") int id) throws IllegalAccessException, InvocationTargetException{
	
	ContactUs pf=contactrepo.findContactUsById(id);
	//Phone ph=phonerepository.findPhoneById(id);
	 //return ph.getContactus();
	//pf.getPhones().get(0).setContactus(null);
	for(Phone p:pf.getPhones())
	{
		p.setContactus(null);
		phonerepository.delete(p);
	}
	//NullAwareBeanUtilsBean nullAwareBeanUtilsBean = new NullAwareBeanUtilsBean();
	//nullAwareBeanUtilsBean.copyProperties(pf, contactus);
	//return contactrepo.updateContactUs(pf);
	contactus.setContactId(id);
	//contactrepo.updateContactUs(contactus);
	
	System.out.println(pf);
	System.out.println(contactus);
	
	return contactusrepository.save(contactus);	
}

@DeleteMapping("/deletecontactonetomany/{id}")
public void deleteprofile(@PathVariable("id") int id){
	contactusrepository.deleteById(id);;
}
@GetMapping("/profiletodetails/{id}")
public Profile2 getProfile1(@PathVariable("id") long id)
{
	Profile2 p=profileservice.getProfile(id);
	return p;
	
}
@GetMapping("/profiletodetails1/{id}")
public ProfileDetail getProfile2(@PathVariable("id") long id)
{
	return profiledetail.findById(id).get();
	
}

@PostMapping("/profilev1details")
public Profile2 getProfilev1(@RequestBody Profile2 profile){
	profilerepo.save(profile);
	
	
	return profilerepo.save(profile);
}
@PostMapping("/profilev2details")
public Profile2 getProfilev2(@RequestBody Profile2 profile){
	profile.getProfiledetails().setProfile(profile);
	profilerepo.save(profile);
	
	
	return profilerepo.save(profile);
}

@DeleteMapping("/profilev1details/{id}")
public void deleteprofile(@PathVariable("id") Long id){
	profilerepo.deleteById(id);
}
@GetMapping("/profiletcontactskk/{id}")
public Profile2 getProfile3(@PathVariable("id") long id)
{
	Profile2 p=profileservice.getProfile(id);
	return p;
	
}
@GetMapping("/profiletcontacts1/{id}")
public ContactUs getProfile4(@PathVariable("id") int id)
{
	return contactusrepository.findById(id).get();
	
}

@PostMapping("/profilevcontact")
public Profile2 getProfilev4(@RequestBody Profile2 profile){
	profilerepo.save(profile);
	
	
	return profilerepo.save(profile);
}
@PostMapping("/profilev2contact")
public Profile2 getProfilev3(@RequestBody Profile2 profile){
	profile.getContactus().setProfile(profile);
	profilerepo.save(profile);
	
	
	return profilerepo.save(profile);
}

@DeleteMapping("/profilev1contact/{id}")
public void deleteprofile1(@PathVariable("id") Long id){
	profilerepo.deleteById(id);
}

}
