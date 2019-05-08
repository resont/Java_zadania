package kolos4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainFrame extends JFrame {
	
	JPanel p_rysunek,menu;
	JLabel rysunek;
	JButton start;
	JRadioButton czerwony,zielony,niebieski;
	ButtonGroup kolory;
	private int red = 255, green = 255, blue = 255;
	
	public MainFrame(String title){
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
		
		p_rysunek.add(rysunek);
		
		czerwony = new JRadioButton("Czerwony");
		czerwony.setSelected(true);
		zielony = new JRadioButton("Zielony");
		niebieski = new JRadioButton("Niebieski");
		
		kolory = new ButtonGroup();
		kolory.add(czerwony);
		kolory.add(zielony);
		kolory.add(niebieski);
		
		menu.add(czerwony);
		menu.add(zielony);
		menu.add(niebieski);
		
		
		start = new JButton("Rysuj!");
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				if(czerwony.isSelected()) {
					red = 255;
					green = 0;
					blue = 0;
				}
				if(zielony.isSelected()){
					red = 0;
					green = 255;
					blue = 0;
				}
				if(niebieski.isSelected()) {
					red = 0;
					green = 0;
					blue = 255;
				}
				repaint();
				
			}
		});
		
		menu.add(start);
		
	}
	@Override
	public void paint(Graphics g) {
		
		super.paintComponents(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(new Color(red,green,blue));
		paintRec(g2);
		
	}
	private void paintRec(Graphics2D g2) {
		// TODO Auto-generated method stub
		Rectangle2D kwadrat = new Rectangle2D.Double(40,40,200,200);
		g2.fill(kwadrat);
	}
}
