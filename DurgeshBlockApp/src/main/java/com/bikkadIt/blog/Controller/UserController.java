package com.bikkadIt.blog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.blog.Service.UserService;
import com.bikkadIt.blog.payLods.ApiResponse;
import com.bikkadIt.blog.payLods.UserDto;

@RestController
@RequestMapping("/api/Phonebook")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//post create user
	@PostMapping()
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		
		UserDto createUserDto = this.userService.createUser(userDto);
		
	
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
		
	}
	//Put update 
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("userId")Integer uid ){
	
	UserDto updateUser=this.userService.updateUser(userDto,uid);
	
	return ResponseEntity.ok(updateUser);
	
	}
	
	//Delete delete user
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId")Integer uid){
		
		this.deleteUser(uid);
		
		return new ResponseEntity<ApiResponse>(new ApiResponse("user deleted Successfully",HttpStatus.OK);
		
		
	
	
	}
	
}
	
	
	


