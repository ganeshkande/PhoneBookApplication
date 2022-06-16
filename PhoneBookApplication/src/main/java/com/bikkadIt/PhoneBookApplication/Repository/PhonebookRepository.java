package com.bikkadIt.PhoneBookApplication.Repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.PhoneBookApplication.model.PhonebookAppEntity;

public interface PhonebookRepository extends JpaRepository<PhonebookAppEntity, Integer> {

}
