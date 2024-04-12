package abiertocerrado;

public class MethodCritopMoney implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Pagado con Cripto: "+amount);
		
	}

}
