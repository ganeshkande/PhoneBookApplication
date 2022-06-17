package com.bikkadIt.PhoneBookApplication2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.bikkadIt.PhoneBookApplication2.model.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer>{

}
