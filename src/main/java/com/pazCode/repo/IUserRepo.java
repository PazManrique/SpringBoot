package com.pazCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pazCode.model.User;

public interface IUserRepo extends JpaRepository<User, Integer> {

	User findByName(String username);



}
