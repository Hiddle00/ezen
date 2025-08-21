import java.sql.*;

//memo 테이블에 데이터를 등록하는 클래스
public class Insert {

	public static void main(String[] args) {
		//1. 드라이버를 로딩한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("boot complete");
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		//2. DBMS에 연결한다.
		String host   = "jdbc:mysql://localhost:3306/memodb";
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
		//3. 데이터베이스 서버에 명령을 전송한다.
		try {
			//3.1 작업개체를 생성한다. (createStatement() 이용 버전)
			Statement stmt = conn.createStatement();
			//3.2 작업객체를 이용해서 SQL 구문을 실행한다.
			String title = "제목입니다.";
			String note = "내용입니다.";
			
			String sql = "";
			for(int i = 1; i <= 20; i++) {
				title = String.format("[%03d]번째 제목입니다.", i);
				sql  = "insert into memo(title, note)";
				sql += "values ('" + title + "' , '" + note + "')";
				stmt.executeUpdate(sql);
			}
//			int count = 500;
//			for(int i : count) {
//				sql  = "insert into memo(title, note)";
//				sql += "values ('" + title + "' , '" + note + "')";
//				stmt.executeUpdate(sql);
//			}
			System.out.println("insert success");
			//3.3 작업 객체를 닫는다.
			stmt.close();
			System.out.println("stmt close");
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		//4. 데이터베이스 서버와 연결을 종료한다.
		try {
			conn.close();
			System.out.println("connection close");
		}catch(Exception e) {}
		
		System.out.println("Program terminated");
		
		
	}
}
