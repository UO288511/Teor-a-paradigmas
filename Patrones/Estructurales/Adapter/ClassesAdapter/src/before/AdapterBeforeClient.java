package before;

class LegacyLine {
	// to draw a line we need the coordinates of its extreme points
	public void drawLine(int x1, int y1, int x2, int y2) {
		System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2 + ')');
	}
}

class LegacyRectangle {
	// to draw a rectangle we need the coordinates of its top left corner, its width
	// and its height
	public void drawRectangle(int x, int y, int w, int h) {
		System.out.println("rectangle at (" + x + ',' + y + ") with width " + w + " and height " + h);
	}
}

public class AdapterBeforeClient {
	public static void main() {
		Object[] shapes = { new LegacyLine(), new LegacyRectangle() };
		// start and end point
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		for (int i = 0; i < shapes.length; ++i)
			// we need to identify every type of figure to call the corresponding method,
			// with the correct arguments
			if (shapes[i] instanceof before.LegacyLine)
				((LegacyLine) shapes[i]).drawLine(x1, y1, x2, y2);
			else if (shapes[i] instanceof before.LegacyRectangle)
				((LegacyRectangle) shapes[i]).drawRectangle(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1),
						Math.abs(y2 - y1));
	}
}
