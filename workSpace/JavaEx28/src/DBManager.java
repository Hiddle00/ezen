/*
 * 모듈명 : MySQL 데이터베이스를 사용하기 위한 공용 클래스
 * 작성일 : 2025.08.21
 * 작성자 : 최연흠
 */
import java.util.*;
import java.sql.*;
public class DBManager {
	private Connection conn = null;
	private Statement  stmt = null;
	private ResultSet    rs = null;
	
	//기능 : 드라이버를 로딩한다.
	//리턴 : ture-로딩성공, false-로딩실패
	private boolean LoadDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("boot complete");
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//기능 : DBMS에 접속한다.
	//리턴 : ture-접속성공, false-접속실패
	public boolean DBOpen() {
		if(LoadDriver() == false) {
			return false;
		}
		String host = "jdbc:mysql://localhost:3306/memodb";
		host += "?useUnicode=true&characterEncoding=utf-8";
		host += "&serverTimezone=UTC";
		
		try {
			conn = DriverManager.getConnection(host,"root","ezen");
			System.out.println("connection permit");
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}	
		return true;
	}
	
	//기능 : DBMS 접속을 종료한다.
	//리턴 : 없음
	public void DBClose() {
		try {
			conn.close();
			System.out.println("connection closed");
		}catch(Exception e) {}
		
		System.out.println("Program terminated");
	}
	
	//기능 : insert, delete, update 문장 실행
	//파라미터 : sql - insert/delete/update SQL 구문
	//리턴 : ture-실행성공, false-실행실패
	public boolean RunSQL(String sql) {
		System.out.println(sql);
		try {
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//기능 : select 문장 실행
	//파라티터 : sql - select SQL 구문
	//리턴 : true-실행성공, false-실행실패
	public boolean OpenSelect(String sql) {
		System.out.println(sql);
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		}catch(Exception e) {					//예외 떠넘기기 연습도 가능
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//기능 : select 문장 실행 종료
	public void CloseSelect() {
		try {
			stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//기능 : ResultSet의 커서를 다음행으로 이동한다.
	//파라메터 : 없음
	//리턴값 : true-이동 성공, false-이동 실패
	public boolean Next() {
		try {
			return rs.next();
		}catch(Exception e) {
			return false;
		}
	}
	
	//기능 : ResultSet에서 해당 컬럼 값을 얻는다.
	//파라메터 : column - 컬럼 이름
	//리턴값 : 컬럼의 값	
	public String GetValue(String column) {
		try {
			return rs.getString(column);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
