
public class Main {

	public static void main(String[] args) throws NegativeLengthException {
		Figura[] figury = new Figura[4];
		figury[0] = new Prostokat(2,3);
		figury[1] = new Kolo(5);
		figury[2] = new Kwadrat(3);
		figury[3] = new Kolo(4);
		
		for(Figura p: figury){
			System.out.println("Figura = "+p.getRodzaj()+" Pole = "+p.getPole()+" Obwód = "+p.getObwod());
		}

	}

}
