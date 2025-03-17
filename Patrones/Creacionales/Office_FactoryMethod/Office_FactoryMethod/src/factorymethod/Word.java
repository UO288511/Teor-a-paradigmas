package factorymethod;

public class Word extends Application {

	@Override
	public Document createDocument() {
		return new WordDoc();
	}
}
