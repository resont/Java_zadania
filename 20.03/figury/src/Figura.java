
public abstract class Figura {
	private String rodzaj;
	protected String getRodzaj(){
		return rodzaj;
	}
	protected void setRodzaj(String rodzaj){
		this.rodzaj = rodzaj;
	}
	abstract protected double getPole();
	abstract protected double getObwod();
	
}
