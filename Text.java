import java.awt.Graphics;

public class Text implements Component{

	int x;
	int y;
	String text;
	
	
	//Constructor
	public Text(String src, int a, int b)
	{
		text = src;
		x = a;
		y = b;
	}
	
	public void draw(Graphics g)
	{
		g.drawString(text, x, y); //drawString is from Graphics library to display text
	}
	
}

