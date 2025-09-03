/* **********************************************
 스프링을 사용하지 않고 DI 연습하기
 POJO를 이용한 DI연습(Plain Old Java Object)
********************************************** */
package ezen.test;

import ezen.di.*;

public class Test {

	public static void main(String[] args) {
		Person hong   = new Student();
		School school = new School();
		school.setPerson(hong);
		school.Print();
		
		Person jeon   = new Teacher();
		school.setPerson(jeon);
		school.Print();
		
	}

}
