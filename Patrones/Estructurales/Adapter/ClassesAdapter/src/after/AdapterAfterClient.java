package after;

// ORIGINAL CLASSES

class LegacyLine {
	public void drawLine(int x1, int y1, int x2, int y2) {
		System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2 + ')');
	}
}

class LegacyRectangle {
	public void drawRectangle(int x, int y, int w, int h) {
		System.out.println("rectangle at (" + x + ',' + y + ") with width " + w + " and height " + h);
	}
}

// ADAPTER INTERFACE

interface Shape {
	// Every figure (Shape) can stand the method draw() from two points
	void draw(int x1, int y1, int x2, int y2);
}

// SPECIFIC ADAPTER CLASSES (IMPLEMENT THE INTERFACE Shape)

/**
 * Adapter class of a "LegacyLine" inherit from that class the access to its
 * methods through super.NameMethod(...) and implement the operations from the
 * interface Shape
 */
class Line extends LegacyLine implements Shape {
	public void draw(int x1, int y1, int x2, int y2) { // it is called the method draw of its father class
														// because the arguments coincide (only changes the name of the
														// method)
		super.drawLine(x1, y1, x2, y2);
	}
}

/**
 * Adapter class of a "LegacyRectangle" inherit from that class the access to
 * its methods through super.NameMethod(...) and implement the operations from
 * the interface Shape
 */
class Rectangle extends LegacyRectangle implements Shape {
	public void draw(int x1, int y1, int x2, int y2) {
		// calculate the width and height
		// and now we can call to the method drawRectangle() from the main class
		super.drawRectangle(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
	}
}

public class AdapterAfterClient {
	public static void main() {
		Shape[] shapes = { new Line(), new Rectangle() };
		// start and end point
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		for (int i = 0; i < shapes.length; ++i)
			// to draw the figures, it is not necessary to know its specific type
			// because they are "adapted" to the interface "Shape"
			shapes[i].draw(x1, y1, x2, y2);
	}
}
