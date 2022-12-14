package com.pazCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pazCode.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

}
