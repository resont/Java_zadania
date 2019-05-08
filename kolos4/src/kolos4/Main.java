package kolos4;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainFrame mf = new MainFrame("Panel do rysowana");
				mf.setVisible(true);
				
			}
		});
		

	}

}
