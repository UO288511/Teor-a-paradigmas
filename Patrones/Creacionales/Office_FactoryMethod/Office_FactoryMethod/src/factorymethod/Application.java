package factorymethod;

import java.util.ArrayList;

public abstract class Application {

	/**
	 * collection of documents
	 */
	private ArrayList<Document> docs;

	/**
	 * Default constructor
	 */
	public Application() {
		docs = new ArrayList<Document>();
	}

	/**
	 * astract method that generates a document depending on the application
	 */
	public abstract Document createDocument();

	/**
	 * New document
	 */
	public void newDocument() {
		// create a docx
		docs.add(/* new WordDoc() */ createDocument());
	}

	/**
	 * Open a saved document 
	 * @param path to the folder where the document is 
	 */
	public void openDocument(String path) {
		Document x = /*new WordDoc()*/ createDocument();

		// read the document from the folder in -> x
		x.open(path);

		docs.add(x);
	}

	// rest of the operations...

	// ...

}
