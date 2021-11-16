package by.epam.ld.nb.repository;

import java.util.ArrayList;
import java.util.List;

import by.epam.ld.nb.entity.NoteBook;

// Repository
public class NoteBookProvider {
	private static final NoteBookProvider instance = new NoteBookProvider();
	
	private List<NoteBook> wh = new ArrayList<NoteBook>();
	
	private NoteBookProvider() {
		wh.add(new NoteBook());
	}

	public NoteBook getNoteBook(int index) {
		if(index >= wh.size()) {
			throw new RuntimeException("error");
		}
		return wh.get(index);
	}
	
	public void addNewNoteBook(NoteBook newNB) {
		wh.add(newNB);
	}

	public static NoteBookProvider getInstance() {
		return instance;
	}
	
	public int createNewNoteBook() {
		NoteBook noteBook = new NoteBook();
		wh.add(noteBook);
		return wh.size() - 1;
	}
	
	public int whSize() {
		return this.wh.size();
	}

}
