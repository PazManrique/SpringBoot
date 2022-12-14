package com.pazCode.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.pazCode.model.User;
import com.pazCode.repo.IUserRepo;

@SpringBootTest
class UserRepoTest {
	
@Autowired	
private IUserRepo usuRepo;	
@Autowired
private BCryptPasswordEncoder encoder;


	@Test
	void testAgregar() {
		User usu = new User (34, encoder.encode("odio"), "odio");
		User usuRetorno = usuRepo.save(usu) ;
		assertEquals(usu.getPassword(), usuRetorno.getPassword());
	}

}
