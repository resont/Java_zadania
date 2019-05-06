import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


import javax.swing.JFrame;
import javax.swing.Timer;

public class MainFrame extends JFrame {
	private Timer tm;
	private Point2D start = new Point2D.Double(5, 5), end = new Point2D.Double(150,150);
	public MainFrame(String title) {
		super(title);
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		setSize(d.width/2,d.height/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		tm = new Timer(50,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				start.setLocation(new Point2D.Double(start.getX(),start.getY()));
				end.setLocation(new Point2D.Double(end.getX()+1,end.getY()+1));
				repaint();
			}
		});
		tm.start();
		
		
	}
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		paintLine(g2,start,end);
		
		
//		Ellipse2D elipsa = new Ellipse2D.Double(100,100,300,300);
//		g2.setColor(new Color(0,255,0));
//		g2.fill(elipsa);
//		
//		
//		Rectangle2D kwadrat = new Rectangle2D.Double(80,80,400,400);
//		g2.setColor(new Color(255,0,0));
//		g2.draw(kwadrat);
//		
//		Line2D linia = new Line2D.Double(0, 0, 200, 200);
//		g2.draw(linia);
		
		
		
	}
	private void paintLine(Graphics2D g2, Point2D start2, Point2D end2) {
		// TODO Auto-generated method stub
		Line2D linia = new Line2D.Double(start,end);
		g2.draw(linia);
	}

}
