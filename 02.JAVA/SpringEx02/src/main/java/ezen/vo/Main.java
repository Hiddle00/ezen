/* *************************************************
 MyBatis 예제 소스코드
 참고 URL : https://blog.naver.com/songintae92/221216410360
************************************************* */
package ezen.vo;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main 
{
	public static void main(String[] args) 
	{
		//현재 작업이 처리되는 디렉토리 명 
	    String workingDir = System.getProperty("user.dir");
	    System.out.println("Current working directory : " + workingDir);

	    try 
		{
			//mybatis 설정 파일을 읽어들인다.
			String configXML = "config.xml";			
			Reader reader = Resources.getResourceAsReader(configXML);
			
			//설정파일의 ${dbname}, ${user}, ${pass} 영역 설정 
			Properties properties = new Properties();
			properties.put("dbname", "ezen");
			properties.put("user", "root");
			properties.put("pass", "ezen");
			
			// SqlSessionFactory 객체 취득
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader,properties);			
			
			// SqlSession 객체를 취득
			boolean autoCommit = true;
			SqlSession session = factory.openSession(autoCommit);
			
			//모든 자료 삭제
			session.delete("truncate");
			
			//자료등록
			DataVO vo = new DataVO();
			for(int i = 1; i < 100; i++)
			{
				String title = String.format("%03d번째 제목입니다.", i);
				vo.setTitle(title);
				session.insert("insert",vo);
			}
			
			//자료 삭제
			session.delete("delete","99");
			
			//1번 자료 조회
			vo = session.selectOne("one", "1");
			System.out.println(vo.getTitle());
			
			//자료 목록 조회
			List<DataVO> list = session.selectList("list");
			for(DataVO v : list)
			{
				System.out.println(v.getTitle());
			}
			
			//session 종료
			session.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
