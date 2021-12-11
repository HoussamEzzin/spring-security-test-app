package ma.ac.emi.ginfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ac.emi.ginfo.entites.User;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, Long>{
	
	User findByUserName(String username);

}
