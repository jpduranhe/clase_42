package coding1;

import java.util.List;

public class DbCointList implements DbCoin {
	
	private List<Coin> listConins;

	@Override
	public void addCoin(Coin coin) {
		listConins.add(coin);	
	}

	@Override
	public void refreshPrices() {
		// TODO Auto-generated method stub
		
	}

}
