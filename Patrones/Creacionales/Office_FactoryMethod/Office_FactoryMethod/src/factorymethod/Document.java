package factorymethod;

public interface Document {

	void open(String path);

	void close();

	void save();

	void undo();

}
