package com.oneNote.oneNote.mongoNote;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Database_sequences")
public class DB_sequences {
	@Id
    private String id;

    private int seq;
    
    public DB_sequences() {}
    
    public void setId(String id) {
    	this.id = id;
    }
    
    public String getId() {
    	return this.id;
    }
    
    public void setSeq(int seq) {
    	this.seq = seq;
    }
    
    public int getSeq() {
    	return this.seq;
    }
}
