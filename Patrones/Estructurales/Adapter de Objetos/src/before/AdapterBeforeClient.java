package before;

class LegacyLine
{
	// para dibujar una línea necesitamos las coordenadas de sus dos puntos extremos
	public void drawLine(int x1, int y1, int x2, int y2)
	{
		System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' 
				+ y2 + ')');
	}
}

class LegacyRectangle
{
	// para dibujar un rectángulo necesitamos las coordenadas de su punto superior izquierdo y su ancho y alto
	public void drawRectangle(int x, int y, int w, int h)
	{
		System.out.println("rectangle at (" + x + ',' + y + ") with width " + w
				+ " and height " + h);
	}
}

public class AdapterBeforeClient
{
	public static void main()
	{
		Object[] shapes = 
		{
				new LegacyLine(), new LegacyRectangle()
		};
		// Un punto inicial y final fijado por un editor gráfico
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		for (int i = 0; i < shapes.length; ++i)
			// necesitamos identificar el tipo de cada figura para llamar al método adecuado, con los argumentos adecuados
			if (shapes[i] instanceof before.LegacyLine)
				((LegacyLine)shapes[i]).drawLine(x1, y1, x2, y2);
			else if (shapes[i] instanceof before.LegacyRectangle)
				((LegacyRectangle)shapes[i]).drawRectangle(Math.min(x1, x2), Math.min(y1, y2)
						, Math.abs(x2 - x1), Math.abs(y2 - y1));
	}
}
