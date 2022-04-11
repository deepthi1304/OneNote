package com.oneNote.oneNote.mongoNote;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;
@Component
public class NoteModelListener extends AbstractMongoEventListener<NoteData> {
	private SequenceGeneratorService sequenceGenerator;
	
	/*@Override
	public void onBeforeConvert(BeforeConvertEvent<NoteData> event) {
	    if (event.getSource().getId() < 1) {
	        event.getSource().setId(sequenceGenerator.getNextSequence(NoteData.SEQUENCE_NAME));
	    }
	}*/
}
