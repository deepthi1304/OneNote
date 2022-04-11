package com.oneNote.oneNote.UserNote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.userlogin.demouserloginonenoteapp.repository.UserDataRepository;
//import com.example.userlogin.demouserloginonenoteapp.usercredentials.UserData;
@Service
public class UserDataService {
	@Autowired
	private UserDataRepository repo;
	
	public  UserData saveuser(UserData userdata) {
		
		return repo.save(userdata);
		
	}
	public UserData userdata_by_email(String email) {
		
	    return repo.findByEmail(email);
	}
	
	public UserData userdata_by_password(String password) {
			return repo.findByPassword(password);
		
	}
	
	

}
