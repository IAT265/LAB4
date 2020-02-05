import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import processing.core.PVector;


public class SadFace extends Face {
	
	
	public SadFace(PVector pos, int scale) {
		super(pos, scale);
		
	}
	
	public void draw(Graphics2D g2) {
		AffineTransform transform = g2.getTransform();
		g2.translate(pos.x, pos.y);
		g2.scale(scale, scale);
		
		g2.setTransform(transform);
	}
}
