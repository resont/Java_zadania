package kolos2D;

public class MainClass {

	public static void main(String[] args) {
		Zwierze [] zwierzeta = new Zwierze[2];
		
		zwierzeta[0] = new Pies();
		zwierzeta[1] = new Kot();
		
		for(Zwierze z: zwierzeta) {
			System.out.println(z.getRodzaj());
		}
		
		System.out.println();
		
		for(Zwierze z: zwierzeta) {
			z.setIleRazy(4);
			System.out.println(z.getRodzaj());
			z.dajG³os();
			System.out.println();
		}

	}

}
