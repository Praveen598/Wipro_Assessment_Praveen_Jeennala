package java8Features;
@FunctionalInterface
interface msg{
	 void message();
}
class m2 implements msg{

	@Override
	public void message() {
		System.out.println("message printer");
		
	}
	
}

public class GreetingsPrinter {
	public static void main(String[] args) {
		m2 m=new m2();
		m.message();
		
	}

}
