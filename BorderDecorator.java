import java.awt.*;


public class BorderDecorator extends Decorator{

	public BorderDecorator(Component t, int x, int y, int width, int height)
	{
		super(t, x, y, width, height);
	}
	
	@Override
	public void draw(Graphics g) 
	{
		cmp.draw(g);
		g.drawRect(x, y, width, height);
		Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 ,new float[]{9}, 0);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(dashed);
	}
}
