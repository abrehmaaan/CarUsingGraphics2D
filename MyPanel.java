
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	MyPanel(){
		this.setPreferredSize(new Dimension(500,500));
	}	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
//		AffineTransform at = new AffineTransform();
//		at.scale(1.5, 1.5);
//		g2D.setTransform(at);
		g2D.drawRoundRect(100, 300, 80, 80, 80, 80);
		g2D.drawRoundRect(320, 300, 80, 80, 80, 80);
		g2D.setPaint(Color.GRAY);
		g2D.fillPolygon(new int[] {100,100,180,180,250,250,400,400}, new int[] {300, 250, 250, 200, 200, 250, 250,300}, 8);
	}

}
