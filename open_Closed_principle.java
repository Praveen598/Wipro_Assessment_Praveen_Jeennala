
interface paymentMethod{
	static void pay() {
		// TODO Auto-generated method stub
		
	}
}
class Phonepe implements paymentMethod{

	public void pay() {
		System.out.println("process payment vie phonpie");
	}
	
}
class gpay implements paymentMethod{

	public void pay() {
		System.out.println("process payment via gpay");
	}
	
}
class process{
	void processs(paymentMethod payment) {
		paymentMethod.pay();
	}
}

public class open_Closed_principle {
	public static void main(String[] args) {
		process p = new process();
		p.processs(new gpay());
		p.processs(new Phonepe());
	}

}