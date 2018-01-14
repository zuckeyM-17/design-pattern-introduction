package FactoryMethod.idcard;

import FactoryMethod.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	private ArrayList<IDCard> idCards = new ArrayList<IDCard>();
	
	protected Product createProduct(String owner) {
		return new IDCard(owner, this.idCards.size());
	}
	
	protected void registerProduct(Product product) {
		idCards.add(((IDCard)product));
	}
	public ArrayList<IDCard> getIDCards() {
		return idCards;
	}
}
