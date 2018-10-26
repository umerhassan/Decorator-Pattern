import java.awt.*;


public class BorderDecorator extends Decorator{

	public BorderDecorator(Component cmp, int x, int y, int width, int height)
	{
		super(cmp, x, y, width, height);
	}
	
	public void draw(Graphics g) 
	{
		cmp.draw(g);
		//((Graphics2D) g).setStroke(new BasicStroke(0));
		g.drawRect(x, y, width, height);
		Stroke line = new BasicStroke(10, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 ,new float[]{15}, 0);
		Graphics2D add = (Graphics2D) g;
		add.setStroke(line);
	}
}
