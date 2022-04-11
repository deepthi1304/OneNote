package com.oneNote.oneNote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class OneNoteApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OneNoteApplication.class, args);
	}

}
