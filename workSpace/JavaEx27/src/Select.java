import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

//memo 테이블에서 데이터를 조회하는 클래스
public class Select {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("boot complete");
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		//2.
		String host = "jdbc:mysql://localhost:3306/memodb";
		host += "?useUnicode=true&characterEncoding=utf-8";
		host += "&serverTimezone=UTC";
		
		Connection conn;
		try {
			conn = DriverManager.getConnection(host,"root","ezen");
			System.out.println("connection permit");
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}	
		
		//3.
		try {
			//3.1 작업개체를 생성한다. (createStatement() 이용 버전)
			Statement stmt = conn.createStatement();
			
			//3.2 작업객체를 이용해서 SQL 구문을 실행한다.
			String sql = "";
			sql  = "select no,title,note,wdate ";
			sql += "from memo ";
			sql += "order by no desc ";
			ResultSet rs = stmt.executeQuery(sql);
			List<String> tlist = new ArrayList<>();
//			List<memo> mlist = new ArrayList<>();
			while(rs.next()) {
				String title =  rs.getString("title");
				tlist.add(title);
//				memo m = new memo();
//				m.setNo("no");
//				m.setTitle("title");
//				m.setNote("note");
//				m.setWdate("wdate");
//				mlist.add(m);
				
//				mlist.add(new memo("no","title","note","wdate"));
			}
			for(String t : tlist) {
				System.out.println(t);
			}
//			for(memo m : mlist) {
//				m.printinfo();
//			}
			System.out.println("");
			//3.3 작업 객체를 닫는다.
			stmt.close();
			System.out.println("stmt closed");
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		//4.
		try {
			conn.close();
			System.out.println("connection closed");
		}catch(Exception e) {}
		
		System.out.println("Program terminated");
	}
}
