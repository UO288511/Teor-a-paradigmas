package after;

//CLASES ORIGINALES

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

//INTERFAZ ADAPTADORA

interface Shape
{
  void draw(int x1, int y1, int x2, int y2);
}

//CLASES ADAPTADORAS CONCRETAS (IMPLEMENTAN LA INTERFACE Shape)

/**
 * Clase adaptadora de una "LegacyLine"
 * utiliza dicha clase por composición: campo adaptee, para poder acceder a sus métodos vía adaptee.NombreMétodo(...)
 * e implementa las operaciones de la interfaz Shape
 */
class Line implements Shape
{
    private LegacyLine adaptee = new LegacyLine();
    public void draw(int x1, int y1, int x2, int y2)
    {
    	// simplemente invocamos al método correspondiente en LegacyLine
        adaptee.drawLine(x1, y1, x2, y2);
    }
}

/**
 * Clase adaptadora de un "LegacyRectangle"
 * utiliza dicha clase por composición: campo adaptee, para poder acceder a sus métodos vía adaptee.NombreMétodo(...)
 * e implementa las operaciones de la interfaz Shape
 */
class Rectangle implements Shape
{
    private LegacyRectangle adaptee = new LegacyRectangle();
    public void draw(int x1, int y1, int x2, int y2)
    {
    	// simplemente invocamos al método correspondiente en LegacyRectangle
    	// convirtiendo previamente las segundas coordenadas en ancho y alto
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
        // Un punto inicial y final fijado por un editor gráfico
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (int i = 0; i < shapes.length; ++i)
        	// para dibujar las figuras ya no hace falta saber su tipo concreto
        	// ya que están "adaptadas" a la interfaz "Shape"
          shapes[i].draw(x1, y1, x2, y2);
    }
}

