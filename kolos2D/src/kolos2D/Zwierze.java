package kolos2D;

public abstract class Zwierze {
	protected String rodzaj;
	protected String g�os;
	private int ileRazy = 1;
	
	protected String getRodzaj() {
		return rodzaj;
	}
	
	protected void setIleRazy(int ileRazy) {
		this.ileRazy = ileRazy;
	}
	
	protected void dajG�os() {
		
		for(int i=0; i<ileRazy;i++) {
			System.out.println(g�os);
		}
	}	
	
}
