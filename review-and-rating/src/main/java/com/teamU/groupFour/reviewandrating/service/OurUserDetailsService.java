package com.teamU.groupFour.reviewandrating.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.teamU.groupFour.reviewandrating.entity.OurUserDetails;
import com.teamU.groupFour.reviewandrating.entity.User;
import com.teamU.groupFour.reviewandrating.repository.UserRepository;

@Service
public class OurUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;



	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByEmail(email);
        
		user.orElseThrow(() -> new UsernameNotFoundException("Not found user with email: "+ email));
		return user.map(OurUserDetails::new).get();
	}

}
