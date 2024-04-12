package abiertocerrado;

public class Wallet {
	
	
	void paid(PaymentMethod paymentMethod, double amount) {
		paymentMethod.pay(amount);
	}
}

