package com.oneNote.oneNote.mongoNote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import org.springframework.stereotype.Service;

@Service
public class NoteService {

	@Autowired
    NoteRepository noteRepo;
	
	public void createNote(NoteData note) {
		noteRepo.save(note);
	}
	
	public Iterable<NoteData> listAll() {
        return noteRepo.findAll();
    }
	
	public NoteData getByName(String name) {
        return noteRepo.findNoteByName(name);
    }
	
	public void delete(String id) {
		//MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	    //Query searchQuery = new Query(Criteria.where("id").is(34562341112313));
	    //mongoOperation.remove(searchQuery, Your_entity_class.class);
		noteRepo.deleteById(id);
    }
}
