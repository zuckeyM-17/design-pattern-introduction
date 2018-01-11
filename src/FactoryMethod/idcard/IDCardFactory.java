package FactoryMethod.idcard;

import FactoryMethod.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	private ArrayList<String> owners = new ArrayList<String>();
	
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	public ArrayList<String> getOwners() {
		return owners;
	}
}
