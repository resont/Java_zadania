package kolos2E;

public class MainClass {

	public static void main(String[] args) throws TooManyPassangersException {
		Pojazd [] pojazdy = new Pojazd[3];
		
		pojazdy[0] = new Samochod(20000, 4);
		pojazdy[1] = new Motocykl(10000,1);
		pojazdy[2] = new Samochod(5000,3);
		
		for(Pojazd p: pojazdy) {
			System.out.println(p.getRodzaj() +" "+ p.getPrzebieg() +" "+ p.getLiczbaPasazerow());
		}
	}

}
