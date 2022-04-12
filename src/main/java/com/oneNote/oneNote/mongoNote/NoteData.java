package com.oneNote.oneNote.mongoNote;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Notes")
public class NoteData {
	//@Transient
    //public static final String SEQUENCE_NAME = "db_sequences";
	
	@Id
	private String id;
	
	private String createdBy;
	//private Date createdDate;
	private String title;
	private String content;
	
	public NoteData() {}
	
	public void setId(String id) {
    	this.id = id;
    }
    
    public String getId() {
    	return this.id;
    }
    
    public void setCreatedBy(String createdBy) {
    	this.createdBy = createdBy;
    }
    
    public String getCreatedBy() {
    	return this.createdBy;
    }
    
    /*public void setCreatedDate(Date createdDate) {
    	this.createdDate = createdDate;
    }
    
    public Date getCreatedDate() {
    	return this.createdDate;
    }*/
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
    public void setContent(String content) {
    	this.content = content;
    }
    
    public String getContent() {
    	return this.content;
    }
}
