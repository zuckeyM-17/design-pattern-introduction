package FactoryMethod.idcard;
import FactoryMethod.framework.*;

public class IDCard extends Product {
	private String owner;
	private Integer number;
	
	IDCard(String owner, Integer number) {
		System.out.println(number.toString() + "番目の" + owner + "のカードを作ります。");
		this.owner = owner;
		this.number = number;
	}
	
	public void use() {
		System.out.println(this.getNumberString() + "番目の" + this.getOwner() + "のカードを使います。");
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getNumberString() {
		return number.toString(); 
	}
}
