import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	
	JPanel menu,p_rysunek;
	JButton start;
	JRadioButton czerwony,niebieski;
	JLabel rysunek;
	JTextField k1x,k1y,k2x,k2y;
	ButtonGroup kolory;
	private int red = 0, green = 0, blue = 0;
	private Point2D poczatek = new Point2D.Double(0,0), koniec = new Point2D.Double(0, 0);
	
	
	
	public MainFrame(String title) {
		super(title);
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		setSize(d.width/2,d.height/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		menu = new JPanel();
		p_rysunek = new JPanel();
		
		add(menu,BorderLayout.SOUTH);
		add(p_rysunek,BorderLayout.CENTER);
		
		rysunek = new JLabel();
		
		k1x = new JTextField("",4);
		k1y = new JTextField("",4);
		k2x = new JTextField("",4);
		k2y = new JTextField("",4);
		
		p_rysunek.add(rysunek);
		menu.add(k1x);
		menu.add(k1y);
		menu.add(k2x);
		menu.add(k2y);
		
		czerwony = new JRadioButton("Czerwony");
		czerwony.setSelected(true);
		niebieski = new JRadioButton("Niebieski");
		
		kolory = new ButtonGroup();
		kolory.add(czerwony);
		kolory.add(niebieski);
		
		menu.add(czerwony);
		menu.add(niebieski);
		
		start = new JButton("Rysuj!");
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				poczatek.setLocation(new Point2D.Double(Integer.parseInt(k1x.getText()),Integer.parseInt(k1y.getText())));
				koniec.setLocation(new Point2D.Double(Integer.parseInt(k2x.getText()),Integer.parseInt(k2y.getText())));
				
				if(czerwony.isSelected()) {
					red = 255;
					green = 0;
					blue = 0;
				}else {
					red = 0;
					green = 0;
					blue = 255;
				}
				repaint();
				
			}
		});
		
		menu.add(start);
		menu.setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(new Color(red,green,blue));
		paintLine(g2);
	}
	private void paintLine(Graphics2D g2) {
		Line2D linia = new Line2D.Double(poczatek,koniec);
		g2.draw(linia);
	}
	
}
