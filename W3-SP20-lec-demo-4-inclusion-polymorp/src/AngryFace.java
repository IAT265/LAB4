import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import processing.core.PVector;

public class AngryFace extends Face {

	public AngryFace(PVector pos, int scale) {
		// TODO Auto-generated constructor stub
		super(pos, scale);
	}
	
	public void setFaceAttributes() {
		face.setFrame(-FACE_WIDTH/2, -FACE_WIDTH/2, FACE_WIDTH, FACE_WIDTH);
		eye1.setFrame(-FACE_WIDTH/2 + 2, -FACE_WIDTH/2 + 3,EYE_WIDTH/2, EYE_WIDTH);
		eye2.setFrame(FACE_WIDTH/2 + 2, -FACE_WIDTH/2 + 3,EYE_WIDTH/2, EYE_WIDTH);
		
	}
	
	
	public void drawFace(Graphics2D g2) {
		super.drawFace(g2);
		AffineTransform transform = g2.getTransform();
		
		//draws eyebrows
		
		//draws mouth
		
		g2.setTransform(transform);
	}

}
