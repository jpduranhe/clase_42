package abiertocerrado;

public class Runner {

	public static void main(String[] args) {
		Wallet wallet = new Wallet();
		WalletOld walletOld= new WalletOld();
		
		MethodCreditCard tc= new MethodCreditCard();
		MethodDebitCard db = new MethodDebitCard();
		MethodCritopMoney mc= new MethodCritopMoney();
		MethodPayPal paypal= new MethodPayPal();
		
		wallet.paid(db,200);
		walletOld.payWithCreditCard(200);
		walletOld.payWithDebitCard(200);
	}

}
