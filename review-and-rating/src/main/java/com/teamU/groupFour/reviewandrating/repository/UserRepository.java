package com.teamU.groupFour.reviewandrating.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamU.groupFour.reviewandrating.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByName(String name);
	
	Optional<User> findByEmail(String email);

}
