package com.example.newphone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newphone.model.ProfileDetail;

@Repository
public interface ProfileDetailRepo extends JpaRepository<ProfileDetail, Long> {

}
