package after;

//ORIGINAL CLASSES

class LegacyLine
{
    public void drawLine(int x1, int y1, int x2, int y2)
    {
        System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' 
          + y2 + ')');
    }
}

class LegacyRectangle
{
    public void drawRectangle(int x, int y, int w, int h)
    {
        System.out.println("rectangle at (" + x + ',' + y + ") with width " + w
          + " and height " + h);
    }
}

//ADAPTER INTERFACE

interface Shape
{
  void draw(int x1, int y1, int x2, int y2);
}

//CLASSES FOR A SPECIFIC ADAPTER (IMPLEMENT THE INTERFACE Shape)

/**
 * Adapter class of "LegacyLine"
 * using this class by composition: adaptee field, for accessing to its methods through the adaptee.MethodName(...)
 * and implement the operations in the interface Shape
 */
class Line implements Shape
{
    private LegacyLine adaptee = new LegacyLine();
    public void draw(int x1, int y1, int x2, int y2)
    {
    	// we call the corresponding method in LegacyLine
        adaptee.drawLine(x1, y1, x2, y2);
    }
}

/**
 * Adapter class for "LegacyRectangle" using this class by composition: adaptee
 * field, for accessing to its methods through the adaptee.MethodName(...) and
 * implement the operations in the interface Shape
 */
class Rectangle implements Shape
{
    private LegacyRectangle adaptee = new LegacyRectangle();
    public void draw(int x1, int y1, int x2, int y2)
    {
    	// we call the corresponding method in LegacyRectangle
    	// working out the values for the height and width parameters
        adaptee.drawRectangle(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1),
          Math.abs(y2 - y1));
    }
}

public class AdapterAfterClient
{
    public static void main()
    {
        Shape[] shapes = 
        {
            new Line(), new Rectangle()
        };
        // A start and end point 
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (int i = 0; i < shapes.length; ++i)
        	// to draw the lines is not necessary to know their specific type,
        	// because they are adapted to the interface "Shape"
          shapes[i].draw(x1, y1, x2, y2);
    }
}

