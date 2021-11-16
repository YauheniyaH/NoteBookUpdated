package by.epam.ld.nb.view;

import java.util.List;

import by.epam.ld.nb.entity.Note;
import by.epam.ld.nb.entity.NoteBook;

public class PrintNoteView {
	
	public void print(List<Note> notes) {
		for (int i=0; i<notes.size(); i++) {
			System.out.println("note " +i+" " +notes.get(i));
		}
		return;
	}
	
	public void print(Note note) {
		System.out.println(note.toString());
		return;
	}
	
	public void print(NoteBook nb) {
		for (int i=0; i<nb.size(); i++) {
			System.out.println("note " +i+" " +nb.getNote(i).toString());
		}
		return;
	}

}
