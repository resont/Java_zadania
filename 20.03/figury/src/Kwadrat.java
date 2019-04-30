
public class Kwadrat extends Prostokat{
	
	public Kwadrat(double bok) throws NegativeLengthException{
		super(bok,bok);
		
		if(bok<=0)
			throw new NegativeLengthException();
		
		setRodzaj("Kwadrat");
	}
	

}
