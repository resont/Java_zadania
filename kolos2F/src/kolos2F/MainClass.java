package kolos2F;

public class MainClass {

	public static void main(String[] args) {
		Pracownik [] pracownicy = new Pracownik[3];
		
		pracownicy[0] = new Pracownik("Jan Kowalski",3000);
		pracownicy[1] = new Kierownik("Janusz Osman",5000);
		pracownicy[2] = new Pracownik("£ukasz Nowak",2500);
		
		for(Pracownik p: pracownicy) {
			System.out.println(p.getImieNazwisko() +" "+ p.getPensja());
		}
		System.out.println();
		
		for(Pracownik p: pracownicy) {
			p.zwiekszWynagrodzenie(20);
			System.out.println(p.getImieNazwisko() +" "+ p.getPensja());
		}
	}

}
