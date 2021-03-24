package com.example.newphone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newphone.model.Profile2;
@Repository
public interface ProfileRepo extends JpaRepository<Profile2, Long>{

	Profile2 findInstituteById(Long id);

}
