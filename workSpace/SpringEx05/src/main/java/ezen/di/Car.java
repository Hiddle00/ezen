package ezen.di;

public class Car {
	private String product; //제조사
	private String name;    //차량명
	private int    hp;      //마력
	
	public void Print() {
		System.out.println("제조사 : " + product);
		System.out.println("차량명 : " + name);
		System.out.println("마력 : " + hp);
	}

	public String getProduct() {
		return product;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
