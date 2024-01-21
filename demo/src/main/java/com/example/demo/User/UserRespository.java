package com.example.demo.User;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface UserRespository extends JpaRepository<User, Integer> {
	 Optional<User> findByUsernameAndPassword(String username, String password);
	  Optional<User> findByUsernameOrEmail(String username, String email);

}

