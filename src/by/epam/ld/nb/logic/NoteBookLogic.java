package by.epam.ld.nb.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.epam.ld.nb.entity.Note;
import by.epam.ld.nb.entity.NoteBook;
import by.epam.ld.nb.repository.NoteBookProvider;

public class NoteBookLogic {// NoteBook

	private static final NoteBookProvider provider = NoteBookProvider.getInstance();
	
	private NoteBook nb;

	public NoteBookLogic() {
		this.nb = new NoteBook();
		provider.addNewNoteBook(nb);
		
		//int index = provider.createNewNoteBook();
		//nb = provider.getNoteBook(index);
	}
	
	public NoteBookLogic(int index) {
		this.nb = provider.getNoteBook(index);
	}	

	public void setNb(int index) {
		this.nb = provider.getNoteBook(index);
	}
	
	public int getNBIndex() {
		return provider.whSize();
	}
	
	/*
	 * public NoteBookLogic(NoteBook nb) { this.nb = nb; }
	 * 
	 * public void setNb(NoteBook nb) { this.nb = nb; }
	 */

	public void editNote(Note note, String context, Date date) {
		List<Note> notes = nb.getNotes();
		notes.set(notes.indexOf(note), new Note(context, date));
	}

	public void editNote(Note note, Date date) {
		Note n = findNote(note);

		if (n == null) {
			return;
		}

		n.setDate(date);
	}
	
	public void addNote(String content) {
		nb.add(content);
	}

	public Note findByContent(String content) {
		List<Note> notes = nb.getNotes();
		for (Note n : notes) {
			if (n.getNote().equals(content)) {
				return n;
			}
		}
		return null;
	}

	public List<Note> findByPartContent(String content) {
		List<Note> notes = nb.getNotes();
		List<Note> result = new ArrayList<Note>();
		for (Note n : notes) {
			if (n.getNote().contains(content)) {
				result.add(n);
			}
		}
		return result;
	}

	public Note findNote(Note note) {
		List<Note> notes = nb.getNotes();
		if (!notes.contains(note)) {
			return null;
		}

		for (Note n : notes) {
			if (n.equals(note)) {
				return n;
			}
		}

		return null;
	}

	public NoteBook getNb() {
		return this.nb;
	}
}
