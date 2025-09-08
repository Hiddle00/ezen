//데이터베이에서 CRUD를 처리하는 class
//DTO(Data Transfer Object)

package com.ezen.dto;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.ezen.vo.*;

@Repository
public class DataDTO 
{
	@Autowired
	private SqlSession session;
	
	private static final String namespace = "com.ezen.data";
	
	public DataVO Read(String no)
	{
		System.out.println("DataDTO:Read() : run");
		
		try
		{
			if( session == null )
			{
				System.out.println("DataDTO:Read() : session is null");
				return null;
			}
			DataVO vo = session.selectOne(namespace + ".one",no);
			return vo;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
