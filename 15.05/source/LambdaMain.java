package source;


public class LambdaMain {

	public static void main(String[] args) throws NotSameSizeArrays {
		int[] a = {1,2,3,4,5}, b = {4,5,6,7,8};
		
		IntegerPrinter ip = new IntegerPrinter(a, b);
		ip.printIntegers(new ProcessIntegers() {
			
			@Override
			public int processIntegers(int a, int b) {
				
				return a+b;
			}
		});
		

	}

}

@FunctionalInterface
interface ProcessIntegers {
	int processIntegers(int a, int b);
}


class IntegerPrinter {
	private int[] tab,tab2;
	
	public IntegerPrinter(int[] tab,int[] tab2) throws NotSameSizeArrays {
		if (tab.length < tab2.length) throw new NotSameSizeArrays();
		this.tab = tab;
		this.tab2 = tab2;
	}
	
	public void printIntegers(ProcessIntegers pi) {
		for (int i=0;i<tab.length;i++) {
			System.out.println(pi.processIntegers(tab[i], tab2[i]));
		}
	}
	
	
	
	
	
}

class NotSameSizeArrays extends Exception {
	public NotSameSizeArrays() {
		super("Rozne rozmiary tablic");
	}
}
