import java.awt.Graphics;

public class Text implements Component{

	int x;
	int y;
	String text;
	
	
	//Constructor
	public Text(String src, int x, int y)
	{
		text = src;
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g)
	{
		g.drawString(text, x, y);
	}
}
