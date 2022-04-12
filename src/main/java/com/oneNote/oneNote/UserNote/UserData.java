package com.oneNote.oneNote.UserNote;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userdata_tbl")
@CrossOrigin(origins = "http://localhost:4200/registration")
public class UserData {
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int user_id;
	@Column
	public String email;
	@Column
	public String name;
	@Column
	public String password;

}
