package com.oneNote.oneNote.mongoNote;

import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController 
@RequestMapping(path="/note") 
public class MainController {
	@Autowired
	private NoteService service;
	//private SequenceGeneratorService sequenceGenerator;
	
	@PostMapping(path="/create") 
	public @ResponseBody String createNewNote(@RequestBody NoteData note) {
		//sequenceGenerator.getNextSequence(NoteData.SEQUENCE_NAME);
		//int seq = 0;
		//System.out.println(seq + "\n" + note.getCreatedBy() + "\n" + note.getTitle() + "\n" + note.getContent());
		//note.setId(seq);
		service.createNote(note);
	    return "Note created\n";
	}
	
	@GetMapping(path="/findnotes")
	public @ResponseBody Iterable<NoteData> Retrieval() {
		return service.listAll();
	}
	
	@GetMapping("/find/{name}")
	public ResponseEntity<NoteData> get(@PathVariable String name) {
		try {
			NoteData note = service.getByName(name);
	        return new ResponseEntity<NoteData>(note, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<NoteData>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	
	@DeleteMapping(path="/delete")
	public @ResponseBody ResponseEntity<String> deleteUser(@RequestParam String id) {
		try {
	        service.delete(id);
	        return new ResponseEntity<String>("Deleted\n", HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    } 
	}
}
