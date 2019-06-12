package kolos2E;

public abstract class Pojazd {
	protected String rodzaj;
	protected int przebieg;
	protected int liczbaPasazerow;
	
	protected String getRodzaj() {
		return rodzaj;
	}
	
	protected int getPrzebieg() {
		return przebieg;
	}
	
	protected int getLiczbaPasazerow() {
		return liczbaPasazerow;
	}
}
