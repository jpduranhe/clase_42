package abiertocerrado;

public class MethodPayPal  implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Pagado con Paypal: "+amount);
		
	}


}
