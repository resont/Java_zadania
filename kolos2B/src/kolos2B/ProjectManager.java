package kolos2B;

public class ProjectManager extends Pracownik {
	private int liczbaProjektow = 1;
	
	protected ProjectManager(String ImieNazwisko, int pensja) {
		this.ImieNazwisko = ImieNazwisko;
		this.pensja = pensja * getLiczbaProjektow();
		
	}
	@Override
	public void setLiczbaProjektow(int liczbaProjektow) {
		this.liczbaProjektow = liczbaProjektow;
		pensja *= getLiczbaProjektow();
	}
	protected int getLiczbaProjektow() {
		return liczbaProjektow;
	}
	@Override
	protected String getStanowisko() {
		
		return "Project Manager";
	}
	
}
