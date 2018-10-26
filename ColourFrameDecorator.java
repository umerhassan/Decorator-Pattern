import java.awt.*;


public class ColourFrameDecorator extends Decorator{

	public ColourFrameDecorator(Component t, int x, int y, int width, int height)
	{
		super(t, x, y, width, height);
	}
	
	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		Graphics2D g2d = (Graphics2D)g;
		Stroke oldStroke = g2d.getStroke();
		Color oldcolor = g2d.getColor();
		g2d.setStroke(new BasicStroke(12));
		g2d.setColor(Color.red);
		g2d.drawRect(x, y, width, height);
		g2d.setColor(oldcolor);
		g2d.setStroke(oldStroke);
		
	}
	


}
