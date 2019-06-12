package kolos2E;

public class Samochod extends Pojazd {
	protected Samochod(int przebieg, int liczbaPasazerow) throws TooManyPassangersException {
		this.rodzaj = "Samochod";
		this.przebieg = przebieg;
		if(liczbaPasazerow > 5) {
			throw new TooManyPassangersException();
		}else {
			this.liczbaPasazerow = liczbaPasazerow;
		}
	}
}
