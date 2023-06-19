package com.wings.WINGS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wings.WINGS1.entities.Customer01;

@Repository
public interface CustomerRepo extends JpaRepository<Customer01, String>{
	
	@Query(value = "select * from customer01 c where c.IDENTIFIER_VALUE=?1",nativeQuery = true)
	public Customer01 checkExists(String identifierValue);

}
