/*
 * 모듈명 : MySQL 데이터베이스를 사용하기 위한 공용 클래스
 * 작성일 : 2025.02.17
 * 작성자 : 홍길동
 */
package ezen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager 
{
	private Connection conn;
	private Statement  stmt;
	private ResultSet  rs;	
	
	//기능 : 드라이버를 로딩한다.
	//리턴값 : true-로딩 성공, false-로딩 실패
	private boolean LoadDriver()
	{		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	//기능 : DBMS에 접속한다.
	//리턴값 : true-접속 성공, false-접속 실패	
	public boolean DBOpen()
	{		
		if( LoadDriver() == false )
		{
			return false;
		}
		
		try
		{
			String host   = "jdbc:mysql://localhost:3306/memodb";
			host += "?useUnicode=true&characterEncoding=utf-8";
			host += "&serverTimezone=UTC";			
			conn = DriverManager.getConnection(host,"root","ezen");		
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//기능 : DBMS에 접속을 종료한다.
	//리턴값 : 없음		
	public void DBClose()
	{	
		try
		{
			conn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//기능 : insert, delete, update 문장 실행
	//파라메터 : sql - insert/delete/update SQL 구문
	//리턴값 : true-실행 성공, false-실행 실패
	public boolean RunSQL(String sql)
	{
		try
		{
			Statement stmt = conn.createStatement();
			System.out.println(sql);
			stmt.executeUpdate(sql);
			stmt.close();
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//기능 : select 문장 실행
	//파라메터 : sql - select SQL 구문
	//리턴값 : true-실행 성공, false-실행 실패	
	public boolean OpenSelect(String sql)
	{
		try
		{
			stmt = conn.createStatement();
			System.out.println(sql);
			rs   = stmt.executeQuery(sql);			
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	
	//기능 : select 문장 실행을 종료한다.	
	public void CloseSelect()
	{
		try
		{
			stmt.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//기능 : ResultSet의 커서를 다음행으로 이동한다.
	//파라메터 : 없음
	//리턴값 : true-이동 성공, false-이동 실패
	public boolean Next()
	{
		try
		{
			return rs.next();
		}catch(Exception e)
		{
			return false;
		}
	}
	
	//기능 : ResultSet에서 해당 컬럼 값을 얻는다.
	//파라메터 : column - 컬럼 이름
	//리턴값 : 컬럼의 값	
	public String GetValue(String column)
	{
		try
		{
			return rs.getString(column);
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	//작은 따옴표를 작은 따옴표 2개로 변환한다.
	public String _R(String value)
	{
		if( value == null)
		{
			return null;
		}
		return value.replace("'","''");
	}
}



