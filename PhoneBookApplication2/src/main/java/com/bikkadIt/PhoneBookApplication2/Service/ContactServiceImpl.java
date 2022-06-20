package com.bikkadIt.PhoneBookApplication2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.PhoneBookApplication2.Repository.ContactRepository;
import com.bikkadIt.PhoneBookApplication2.model.ContactEntity;

@Service
public class ContactServiceImpl implements ContactServiceI {
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean savecontact(ContactEntity contact) {
		
		ContactEntity save = contactRepository.save(contact);
		
		if(save !=null) {
			return true;
			
		}else {
			
			return false;
		}
		
		
	}

	//@Override
	//public List<ContactEntity> getAllContact() {
		
		//List<ContactEntity> contact = contactRepository.findAll();
		
		//return contact ;
	}

	

	
	//}


