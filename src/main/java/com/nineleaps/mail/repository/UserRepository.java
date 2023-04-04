package com.nineleaps.mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.mail.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  

User findByUserEmailIgnoreCase(String emailId);

Boolean existsByUserEmail(String email);
}