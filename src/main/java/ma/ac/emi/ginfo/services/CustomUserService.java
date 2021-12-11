package ma.ac.emi.ginfo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ma.ac.emi.ginfo.entites.User;
import ma.ac.emi.ginfo.repository.UserDetailsRepository;


@Service
public class CustomUserService implements UserDetailsService {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userDetailsRepository.findByUserName(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User not found with username : "+username);
		}
		return user;
	}

}
