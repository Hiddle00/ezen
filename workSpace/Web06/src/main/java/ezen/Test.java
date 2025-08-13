package ezen;

public class Test {

	public static void main(String[] args) {
		int z = Calculater.DoCal("11","22","+");
		System.out.println(z);
		z = Calculater.DoCal("100","2,200","-");
		System.out.println(z);
		z = Calculater.DoCal("1,100","2,200","*");
		System.out.println(z);
		z = Calculater.DoCal("11,000","0","/");
		System.out.println(z);
	}

}
