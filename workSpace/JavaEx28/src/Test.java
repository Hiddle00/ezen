//DBManager 클래스 테스트를 위한 클래스
public class Test {
	
	public static void main(String[] args) {
		DBManager db = new DBManager();
		if(db.DBOpen() == false) {
			System.out.println("로딩 실패");
		}else {
			System.out.println("로딩 성공");
		}
		String mode = "insert"; 
		String sql  = "";
		
		switch(mode) {
		case "delete": 
			//delete 삭제 연습
			sql = "delete from memo";
			db.RunSQL(sql);
			break;
		case "insert": 
			//insert 등록 연습
			String title = "제목입니다.";
			String note  = "내용입니다.";
			
			for(int i = 0; i < 20; i++) {
				title = String.format("[%03d]변경된 제목입니다.", i);
				sql  = "insert into memo ";
				sql += "(title, note) ";
				sql += "values ( '" + title + "', '" + note + "')";
				db.RunSQL(sql);
			}
			break;
		case "update":
			//update 변경 연습
			sql  = "update memo ";
			sql += "set title = '변경된 제목입니다.' ";
			sql += "where no = 20 ";
			db.RunSQL(sql);
			break;
		case "select":
			//select 연습
			sql  = "select no, title ";
			sql += "from memo ";
			db.OpenSelect(sql);
			while(db.Next() == true) {
				String no    = db.GetValue("no");
				title = db.GetValue("title");
				System.out.printf("[%s][%s]\n", no, title);
			}
			db.CloseSelect();
			break;
		}
		
		db.DBClose();
	}
}
