package com.bikkadIt.PhoneBookApplication2.Service;

import java.util.List;

import com.bikkadIt.PhoneBookApplication2.model.ContactEntity;

public interface ContactServiceI {
	
	boolean savecontact(ContactEntity contact);
	
	//List<ContactEntity> getAllContact();

}
