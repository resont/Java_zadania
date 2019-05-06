package showimage;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MainFrame extends JFrame {
	
	JPanel pRysunek, pGuziki;
	JLabel lObrazek, lSciezka;
	JButton bLaduj;
	public MainFrame(String title) {
		super(title);
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		setSize(d.width/2,d.height/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		pGuziki = new JPanel();
		pRysunek = new JPanel();
		
		add(pGuziki,BorderLayout.SOUTH);
		add(pRysunek,BorderLayout.CENTER);
		lObrazek = new JLabel();
		lSciezka = new JLabel("lokalizacja pliku");
		pRysunek.add(lObrazek);
		pRysunek.add(lSciezka);
		bLaduj = new JButton("£aduj obrazek");
		bLaduj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fch = new JFileChooser();
				JButton clickedButton = (JButton)e.getSource();
				JPanel panelZGuzikiem = (JPanel)clickedButton.getParent();
				Container naszeOkno = panelZGuzikiem.getParent();
				
				if(fch.showOpenDialog(naszeOkno)==JFileChooser.APPROVE_OPTION){
					String path = fch.getSelectedFile().getAbsolutePath();
					lSciezka.setText(path);
					
					ImageIcon img = new ImageIcon(path);
					Image image = img.getImage();
					Image rescaledImage = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
					lObrazek.setIcon(new ImageIcon(rescaledImage));
				}
				
			}
		});
		pGuziki.add(bLaduj);
		
		
		
	}
}
