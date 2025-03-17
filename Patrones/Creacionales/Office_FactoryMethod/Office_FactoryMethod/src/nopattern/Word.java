package nopattern;

import java.util.ArrayList;

public class Word {
	/**
	 * collection of documents
	 */
	private ArrayList<WordDoc> docs;

	/**
	 * Default constructor
	 */
	public Word() {
		docs = new ArrayList<WordDoc>();
	}

	/**
	 * New document
	 */
	public void newDocument() {
		// create a docx
		docs.add(new WordDoc());
	}

	/**
	 * Open saved document
	 * @param path to the folder where the document is saved
	 */
	public void openDocument(String path) {
		WordDoc x = new WordDoc();

		// read document from file in -> 
		x.open(path);

		docs.add(x);
	}

	// rest of the operations...

	// ...

}
