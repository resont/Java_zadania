package kolos2B;

public class MainClass {

	public static void main(String[] args) {
		
		Pracownik [] pracownicy = new Pracownik[3];
		
		pracownicy[0] = new ProjectManager("Jan Kowalski",4000);
		pracownicy[1] = new Konsultant("Krzysztof Krawczyk",3000);
		pracownicy[2] = new ProjectManager("Adam Ma³ys", 6000);
		
		for(Pracownik p: pracownicy) {
			System.out.println(p.getImieNazwisko() +" "+ p.getStanowisko() +" "+ p.getPensja());
		}
		System.out.println();
		
		pracownicy[0].setLiczbaProjektow(3);
		pracownicy[1].setliczbaKlientow(4);
		pracownicy[2].setLiczbaProjektow(6);

		for(Pracownik p: pracownicy) {
			System.out.println(p.getImieNazwisko() +" "+ p.getStanowisko() +" "+ p.getPensja());
		}
	}

}
