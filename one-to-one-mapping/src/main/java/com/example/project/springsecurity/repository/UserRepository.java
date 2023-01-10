package com.example.project.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.springsecurity.entity.user;



@Repository
public interface UserRepository extends JpaRepository<user, Long>{

}
