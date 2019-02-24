package com.referminds.userservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.referminds.userservice.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {

}