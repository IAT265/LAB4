import java.awt.*;
import java.awt.geom.*;
import java.awt.color.*;

import processing.core.*;

public class Face {
	
	protected Ellipse2D.Double face, eye1, eye2;
	protected Line2D.Double eyebrow1, eyebrow2;
	protected Arc2D.Double mouth;
	protected PVector pos;
	public int faceSize, scale;
	public Color faceColor, eyeColor;
	
	public static final int FACE_WIDTH = 20;
	public static final int BODY_WIDTH = 34;
	public static final int BUG_HEIGHT = 30;
	public static final int EYE_WIDTH = 6;
	
	public Face(PVector pos, int scale) {
		this.pos = new PVector(pos.x,pos.y);
		this.scale = scale;
		face = new Ellipse2D.Double();
		eye1 = new Ellipse2D.Double();
		eye2 = new Ellipse2D.Double();
		eyebrow1 = new Line2D.Double();
		eyebrow2 = new Line2D.Double();
		mouth = new Arc2D.Double();
	}

	public void setFaceAttributes() {
		face.setFrame(-FACE_WIDTH/2, -FACE_WIDTH/2, FACE_WIDTH, FACE_WIDTH);
		eye1.setFrame(-FACE_WIDTH/2 + 2, -FACE_WIDTH/2 + 3,EYE_WIDTH/2, EYE_WIDTH);
		eye2.setFrame(FACE_WIDTH/2 + 2, -FACE_WIDTH/2 + 3,EYE_WIDTH/2, EYE_WIDTH);
	}
	
	public void drawFace(Graphics2D g2) {
		AffineTransform transform = g2.getTransform();
		g2.translate(pos.x, pos.y);
		g2.scale(scale, scale);
		
		//draws face
		g2.setColor(new Color(250, 208, 140));
		g2.fill(face);
		
		//draws eyes
		g2.setColor(new Color(0, 0, 0));
		g2.fill(eye1);
		g2.fill(eye2);
		
		g2.setTransform(transform);
	}

}
