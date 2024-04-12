package abiertocerrado;

public class MethodCreditCard implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Pagado con TC: "+amount);
		
	}

}
