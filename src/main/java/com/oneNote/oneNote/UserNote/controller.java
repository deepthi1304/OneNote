package com.oneNote.oneNote.UserNote;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.userlogin.demouserloginonenoteapp.service.UserDataService;
//import com.example.userlogin.demouserloginonenoteapp.usercredentials.UserData;

@RestController
public class controller {
	@Autowired
	private UserDataService userservice;
	@PostMapping("/createaccount")
	@ResponseBody
	public  String CreateAccount(@RequestBody UserData userdata) {
		       if(userservice.userdata_by_email(userdata.email)==null)
		       {
		    	   userservice.saveuser(userdata);
		    	  return "Account is created";
		       }
		       return "Acoount exist with such name";
		
			}
	@GetMapping("/login/{email}/{password}")
	@ResponseBody
	public String Authentication(@PathVariable String email,@PathVariable String password) {
		try { 
		UserData userdata=userservice.userdata_by_email(email);
	
		 
		  if((userdata!=null)){
				if(userdata.password.equals(password)) {
					return "Login done";
				}
				else {
					return "invalid credential";
				}
		  }
		}
		catch(NullPointerException e) {
		  
		  }
		return "account not exist";
		
	}
	
 
}
