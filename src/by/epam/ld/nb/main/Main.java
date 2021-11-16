package by.epam.ld.nb.main;

import java.util.List;

import by.epam.ld.nb.entity.Note;
import by.epam.ld.nb.entity.NoteBook;
import by.epam.ld.nb.logic.NoteBookLogic;
import by.epam.ld.nb.repository.NoteBookProvider;
import by.epam.ld.nb.view.PrintNoteView;

public class Main {

	public static void main(String[] args) {
		NoteBookLogic logic  = new NoteBookLogic();
		PrintNoteView view = new PrintNoteView();
		System.out.println(logic.getNBIndex());
		
		try {
			logic.setNb(0);
			logic.addNote("22222");
			logic.addNote("1111");
			view.print(logic.getNb());
			
			Note note = logic.findByContent("1111");
			view.print(note);
			
			List<Note> notesFound = logic.findByPartContent("1");
			view.print(notesFound);
			
			logic.setNb(1);
			logic.addNote("33333");
			 view.print(logic.getNb());
		}catch(Exception e) {
			System.out.println("sorry( ");
		}		
		
	}
}



