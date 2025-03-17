package factorymethod;

public class Excel extends Application {

	@Override
	public Document createDocument() {
		return new ExcelDoc();
	}
}
