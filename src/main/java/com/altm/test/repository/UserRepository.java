package com.altm.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altm.test.model.User;

/*
 * Repository for user entity no special method required yet
 * */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
