package com.oneNote.oneNote.mongoNote;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface NoteRepository extends MongoRepository<NoteData, String> {
	@Query(value = "{'_id' : ObjectId('?0')}", delete = true)
	void deleteById(String id);

	@Query("{createdBy:'?0'}")
    NoteData findNoteByName(String name);

}
