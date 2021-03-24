package com.example.newphone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newphone.model.Profile2;
import com.example.newphone.repository.ProfileRepo;


@Service
public class ProfileService {
	@Autowired
	private ProfileRepo profileRepo;
	
	public Profile2 getProfile(Long id){
		return profileRepo.findInstituteById(id);
	}
}

