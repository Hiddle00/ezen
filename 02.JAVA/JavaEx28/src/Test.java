//DBManager 클래스를 테스트하기 위한 클래스
public class Test 
{
	public static void main(String[] args) 
	{
		DBManager db = new DBManager();
		
		db.DBOpen();
		
		String mode = "delete";
		String sql  = "";

		switch(mode)
		{
		case "delete":
			//데이터 삭제 연습
			sql = "delete from memo";
			db.RunSQL(sql);
			break;
		case "insert":
			//데이터 등록 연습
			String title = "이것은 제목입니다.";
			String note  = "이것은 내용입니다.";
			for(int i = 1; i <= 50; i++)
			{
				title = String.format("[%02d]번째 제목입니다.",i);
				
				sql  = "insert into memo (title,note) ";
				sql += "values ('" + title + "','" + note + "')";
				db.RunSQL(sql);
			}
			break;
		case "update":			
			//데이터 변경 연습
			sql  = "update memo "; 
			sql += "set title = '변경된 제목입니다.' "; 
			sql += "where no = 550 ";
			db.RunSQL(sql);
			break;
		case "select":			
			//select 연습
			sql  = "select no,title ";
			sql += "from memo ";
			db.OpenSelect(sql);		
			while(db.Next() == true)
			{
				String no    = db.GetValue("no");
				title = db.GetValue("title");
				System.out.printf("[%s][%s]\n", no, title);
			}
			db.CloseSelect();
			break;
		}
		
		db.DBClose();
		
		System.out.println("프로그램이 종료 되었습니다.");
	}
}


