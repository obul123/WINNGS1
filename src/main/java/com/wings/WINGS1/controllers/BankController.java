package com.wings.WINGS1.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.wings.WINGS1.entities.Customer01;
import com.wings.WINGS1.exceptions.BadRequestException;
import com.wings.WINGS1.model.CustomerResponse;
import com.wings.WINGS1.services.BankServices;

@RestController
public class BankController {

	@Autowired
	private BankServices bankServices;

	@RequestMapping(method = RequestMethod.POST, value = "/customer")
	public ResponseEntity<CustomerResponse> createCustomer(@Valid @RequestBody Customer01 customer01)
			throws BadRequestException {

		Customer01 customer012 = bankServices.createCustomer(customer01);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{customerId}")
//				.buildAndExpand(customer012.getIdentifierValue()).toUri();
		if (customer012 == null) {
			throw new BadRequestException(
					"Customer already exists with the IdentifierValue " + customer01.getIdentifierValue());
		}
		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setCustomerId(customer012.getCustomerId());
		return new ResponseEntity<>(customerResponse, HttpStatus.CREATED);

	}

}
