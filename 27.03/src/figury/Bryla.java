package figury;

public abstract class Bryla implements Rodzaje, Powierzchnie, Objetosci,Comparable<Bryla> {
	protected String rodzaj;
	@Override
	public String getRodzaj() {
		return rodzaj;
	}

	@Override
	public int compareTo(Bryla bryla) {
		// TODO Auto-generated method stub
		return Double.valueOf(this.getObjetosc()).compareTo(bryla.getObjetosc());
	}
}
