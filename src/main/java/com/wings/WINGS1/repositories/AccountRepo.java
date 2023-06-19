package com.wings.WINGS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wings.WINGS1.entities.Account01;

@Repository
public interface AccountRepo extends JpaRepository<Account01, String>{

}
