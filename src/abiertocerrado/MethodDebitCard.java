package abiertocerrado;

public class MethodDebitCard implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Pagado con DC: "+amount);
		
	}

}
