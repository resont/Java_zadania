package kolos2E;

public class Motocykl extends Pojazd {
	protected Motocykl(int przebieg, int liczbaPasazerow) throws TooManyPassangersException {
		this.rodzaj = "Motocykl";
		this.przebieg = przebieg;
		if(liczbaPasazerow > 2) {
			throw new TooManyPassangersException();
		}else {
			this.liczbaPasazerow = liczbaPasazerow;
		}
	}
}
