package com.wings.WINGS1.services;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wings.WINGS1.entities.Customer01;
import com.wings.WINGS1.repositories.CustomerRepo;

@Service
public class BankServices {

	@Autowired
	private CustomerRepo customerRepo;

	public Customer01 createCustomer(@Valid Customer01 customer01) {
		Random r=new Random();
		int i=100000+r.nextInt(900000);
		customer01.setCustomerId(i);
		Customer01 customer012=customerRepo.checkExists(customer01.getIdentifierValue());
		if(customer012!=null)
			return null;
		return customerRepo.save(customer01);
	}

}
