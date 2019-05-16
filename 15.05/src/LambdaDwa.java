package source;

public class LambdaDwa {
	public static void main(String[] args) {
		String[] tab = {"gadsgadsg","asghh","Macieg","eldo"};
		StringPrinter sp = new StringPrinter(tab);
		sp.printString(x->x.toUpperCase());
		System.out.println("\n\n");
		sp.printString(x->x.substring(0,4).toUpperCase());
	}
}

class StringPrinter {
	String[] tab;
	
	public StringPrinter(String[] tab) {
		super();
		this.tab = tab;
	}
	
	public void printString(StringProcessor sp) {
		for (String s:tab) {
			System.out.println(sp.processString(s));
		}
	}
}

@FunctionalInterface
interface StringProcessor {
	String processString(String s);
}
