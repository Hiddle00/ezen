import java.sql.*;

//memo 테이블에 데이터를 등록하는 클래스
public class Insert 
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
		
		//3.DBMS에 명령을 전송한다.
		try
		{
			//3.1 작업객체를 생성한다. (createStatement()이용 버전)
			Statement stmt = conn.createStatement();
			
			//3.2 작업객체를 이용해서 SQL 구문을 실행한다.
			String title = "제목입니다.";
			String note  = "내용입니다.";
			
			String sql = "";
			for(int i = 1; i <= 500; i++)
			{
				//제목을 "[010]번째 제목입니다." 
				title = String.format("[%03d]번째 제목입니다.",i);
				sql  = "insert into memo(title,note)"; 
				sql += "values('" + title + "','" + note + "')";
				stmt.executeUpdate(sql);
			}
			
			//3.3 작업 객체를 닫는다.
			stmt.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//4.DBMS와 연결을 종료한다.
		try 
		{
			conn.close();
		} catch(Exception e){}
		
		System.out.println("프로그램이 종료 되었습니다.");
	}
}
