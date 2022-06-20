package com.bikkadIt.PhoneBookApplication2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bikkadIt.PhoneBookApplication2.Service.ContactServiceI;
import com.bikkadIt.PhoneBookApplication2.model.ContactEntity;

@Controller
public class ContactController {
	@Autowired
	private ContactServiceI contactServiceI;
	@PostMapping(value="/saveContact",consumes="APPLICATION/JSON")
	public ResponseEntity<String> saveContact(@RequestBody ContactEntity contact){
		
		boolean save = contactServiceI.savecontact(contact);
		
		if(save == true) {
			
			String msg="Contact saved successfully";
			
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}else {
			
			String msg="Contact not saved Successfully";
			
		
		return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
	
		}
	
	}
		//@GetMapping(value="/getAllContact",produces="APPLICATION/JSON")
		//public ResponseEntity<List<ContactEntity>>getAllContact(){
			
			//List<ContactEntity> list = contactServiceI.getAllContact();
			
			//if(list !=null) {
				
				//return new ResponseEntity<List<ContactEntity>>(HttpStatus.OK);
				
		//	}else {
				
				
			//}
			//return null;
	
			
	}
	
//}

