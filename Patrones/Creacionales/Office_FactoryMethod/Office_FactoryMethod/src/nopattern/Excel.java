package nopattern;

import java.util.ArrayList;

public class Excel {
	/**
	 * collection of documents
	 */
	private ArrayList<ExcelDoc> docs;

	/**
	 * Default constructor
	 */
	public Excel() {
		docs = new ArrayList<ExcelDoc>();
	}

	/**
	 * New document
	 */
	public void newDocument() {
		// create 	a docx
		docs.add(new ExcelDoc());
	}

	/**
	 * Open saved document
	 * @param path to the folder where the document is saved
	 */
	public void openDocument(String path) {
		ExcelDoc x = new ExcelDoc();

		// read document from file in -> 
		x.open(path);

		docs.add(x);
	}

	// rest of the operations...

	// ...

}
