package com.test06_20;
public class BA 
{

	public static void main(String[] args) 
	{
//		Account[] Account = null;
//		 = new Account();
//		String name    = "홍길동";
//		String account = "111-111";
//		int    balance = 10000;
//		Account[0] = hong;
		
		AA[] p = new AA[3];
		AA hong = new AA();
		hong.name = "홍길동";
		hong.age = 10000;
		hong.numb = "111-111";
		p[0] = hong;
		
		hong = new AA();
		hong.name = "성춘향";
		hong.age = 20000;
		hong.numb = "111-222";
		p[1] = hong;
		
		for(AA aa: p)
		{
			System.out.println(aa);
		}
		
		System.out.println(p[1].name);
		System.out.println(p[0].name);
		
	}

}
