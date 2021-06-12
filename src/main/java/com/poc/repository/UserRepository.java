package com.poc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public List<User> findByUserName(@Param("userName") String userName);
	
	@Query("from User where userName =:userName")
	public List<User> findByUserNameCustomQuery(@Param("userName") String userName);
}
