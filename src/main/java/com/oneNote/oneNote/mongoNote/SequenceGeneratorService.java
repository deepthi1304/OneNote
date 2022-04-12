package com.oneNote.oneNote.mongoNote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;

@Service
public class SequenceGeneratorService {
	@Autowired
	private MongoOperations mongoOperations;
	
	@Autowired
    public SequenceGeneratorService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public void getNextSequence(String seqName) { 
    	mongoOperations.findAndRemove(query(where("_id").is("db_sequences")), 
    			DB_sequences.class);
        /*DB_sequences counter = mongoOperations.findAndModify(
            query(where("_id").is(seqName)),
            new Update().inc("seq",1),
            options().returnNew(true).upsert(true),
            DB_sequences.class);
        System.out.println(Objects.isNull(counter));*/
        //return !Objects.isNull(counter) ? counter.getSeq() : 1;
    }
}
