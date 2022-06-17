package com.bikkadIt.PhoneBookApplication2.Service;

import org.springframework.stereotype.Service;

import com.bikkadIt.PhoneBookApplication2.Repository.ContactRepository;
import com.bikkadIt.PhoneBookApplication2.model.ContactEntity;

@Service
public class ContactServiceImpl implements ContactServiceI {
	
	private ContactRepository contactRepository;

	@Override
	public boolean savecontact(ContactEntity contactEntity) {
		
		ContactEntity save = contactRepository.save(contactEntity);
		
		if(save !=null) {
			return true;
			
		}else {
			
			return false;
		}
		
		
	}

	
	}


