package by.epam.ld.nb.entity;

import java.util.ArrayList;
import java.util.List;

import com.epam.unit01.task01.Note;

public class NoteBook {

	private List<Note> notes;

	public NoteBook() {
		notes = new ArrayList<Note>();
	}

	public Note getNote(int i) {
		return notes.get(i);
	}
	
	public void add(Note note) {
		notes.add(note);
	}

	public void add(String noteContent) {
		notes.add(new Note(noteContent));
	}

	public int size() {
		return notes.size();
	}

	public List<Note> getNotes() {
		return notes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteBook other = (NoteBook) obj;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NoteBook [notes=" + notes + "]";
	}

}
