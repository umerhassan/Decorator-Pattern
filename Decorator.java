import java.awt.Graphics;

public abstract class Decorator implements Component{
	Component cmp;
	int x;
	int y;
	int width;
	public int height;
	
	public Decorator(Component t, int x, int y, int width, int height)
	{
		this.cmp = t;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw(Graphics g)
	{
		cmp.draw(g);
	}
}
