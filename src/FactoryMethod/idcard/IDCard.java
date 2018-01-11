package FactoryMethod.idcard;
import FactoryMethod.framework.*;

public class IDCard extends Product {
	private String owner;
	public IDCard(String owner) {
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}
	
	public void use() {
		System.out.println(owner + "のカードを使います。");
	}
	
	public String getOwner() {
		return owner;
	}
}
