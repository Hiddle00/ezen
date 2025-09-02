//Maven을 이용한 라이브러리 로딩 예제
package ezen;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sample 
{
	public static void main(String[] args) 
	{
		//1.드라이버를 로딩한다.
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e)
		{
			e.printStackTrace();
			return;
		}	
		
		//2.DBMS에 연결한다.
		String host   = "jdbc:mysql://localhost:3306/memodb";
		host += "?useUnicode=true&characterEncoding=utf-8";
		host += "&serverTimezone=UTC";
		
		Connection conn = null;
		try
		{
			conn = DriverManager.getConnection(host,"root","ezen");
		}catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		
		//4.DBMS와 연결을 종료한다.
		try 
		{
			conn.close();
		} catch(Exception e){}
		
		System.out.println("프로그램이 종료 되었습니다.");		
	}
}

