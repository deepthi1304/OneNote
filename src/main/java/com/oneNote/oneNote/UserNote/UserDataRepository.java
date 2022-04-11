package com.oneNote.oneNote.UserNote;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.userlogin.demouserloginonenoteapp.usercredentials.UserData;
import com.sun.istack.Nullable;

public interface UserDataRepository extends JpaRepository<UserData,Integer>{
  @Nullable
   UserData findByEmail(String name);
  @Nullable
   UserData findByPassword(String name);
}
