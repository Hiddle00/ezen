import java.sql.*;
import java.util.*;

//memo 테이블에 데이터를 조회하는 클래스
public class Select 
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
			
			//3.2 Select를 수행한다.
			String sql = "";
			sql += "select no,title,note,wdate "; 
			sql += "from memo "; 
			sql += "order by no desc ";
			
			//Insert, Update, Delete는
			//stmt.executeUpdate(sql);
			//를 이용하고,
			//Select는
			//stmt.executeQuery(sql);
			//를 사용한다. (중요!!)			
			ResultSet rs = stmt.executeQuery(sql);
			
			List<memo> tlist = new ArrayList<>();
			
			while(rs.next())
			{
				memo m = new memo();
				m.setNo(rs.getString("no"));
				m.setTitle(rs.getString("title"));
				m.setNote(rs.getString("note"));
				m.setWdate(rs.getString("wdate"));
				tlist.add(m);
			}
			
			//받아온 데이터를 출력한다.
			for(memo x : tlist)
			{
				x.PrintInfo();
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


