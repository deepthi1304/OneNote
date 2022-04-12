package com.oneNote.oneNote.UserNote;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
=======

>>>>>>> d62d0a951fc83b99fa516da86a62626539694ab8
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
import org.springframework.web.server.ResponseStatusException;
=======
>>>>>>> d62d0a951fc83b99fa516da86a62626539694ab8

//import com.example.userlogin.demouserloginonenoteapp.service.UserDataService;
//import com.example.userlogin.demouserloginonenoteapp.usercredentials.UserData;

<<<<<<< HEAD
@CrossOrigin
=======
>>>>>>> d62d0a951fc83b99fa516da86a62626539694ab8
@RestController
public class controller {
	@Autowired
	private UserDataService userservice;
<<<<<<< HEAD
	@PostMapping("/createaccount") 
	//@CrossOrigin(origins = "http://localhost:4200/registration")
	@ResponseBody
	public  boolean CreateAccount(@RequestBody UserData userdata) {
		       if(userservice.userdata_by_email(userdata.email)==null)
		       {
		    	   userservice.saveuser(userdata);
		    	  return true;
		       }
		       else
		       {																												
		         //  throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists!");
		    	   return false;
		          
		       }
		     
		   		
		       
			}
	
=======
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
>>>>>>> d62d0a951fc83b99fa516da86a62626539694ab8
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
<<<<<<< HEAD
			           //throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Wrong Credentials");

				return "invalid credentials.Try again using correct email and password";
=======
					return "invalid credential";
>>>>>>> d62d0a951fc83b99fa516da86a62626539694ab8
				}
		  }
		}
		catch(NullPointerException e) {
		  
		  }
		return "account not exist";
		
	}
	
 
}
