
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.*;

import processing.core.PVector;

public class FacePanel extends JPanel implements ActionListener {
	public final static int PANEL_W = 600;
	public final static int PANEL_H = 400;
	public final static int PANEL_X = 100;
	public final static int PANEL_Y = 50;
	private int count = 5;
	private int scale;
	private ArrayList<Face> faces = new ArrayList<Face>();
	private Rectangle2D.Double panel;
	private Timer timer;

	public FacePanel() {
		super();
		this.setBackground(java.awt.Color.white);
		panel = new Rectangle2D.Double();
		scale = 1;
		for (int i = 0; i < count; i++) {
			double choose = Util.random(1, 3);
			int posX = (int)Util.random(100, 700);
			int posY = (int)Util.random(100, 600);
			if (choose == 1) {
				faces.add(new SadFace(new PVector(posX,posY),scale));
			}
			else if (choose == 2) {
				faces.add(new AngryFace(new PVector(posX,posY),scale));
			}
			else {
				faces.add(new HappyFace(new PVector(posX,posY),scale));
			}
			
		}
		
		panel.setFrame(PANEL_X, PANEL_Y, PANEL_W, PANEL_H);

		timer = new Timer(30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(new Color(255,255,255));
		g2.fill(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}