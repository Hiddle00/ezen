/***********************************
 * 클래스 기능 : 댓글 C/R/U/D 처리 클래스
 * 작성자 : 정정훈
 * 작성일 : 2025.09.16
 **********************************/

package com.ezen.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.vo.ReplyVO;

@Service
public class ReplyService 
{
	@Autowired
	private SqlSession session;
	
	private static final String namespace = "com.ezen.board";

	//댓글을 등록한다.
	//return true : 등록 성공, false : 등록 실패 
	public boolean Insert(ReplyVO vo)
	{
		session.insert(namespace + ".reply_insert",vo);
		return true;
	}
	
	//댓글 목록을 조회한다.
	public List<ReplyVO> GetList(String no)
	{
		List<ReplyVO> list = session.selectList(namespace + ".reply_list",no);		
		return list;
	}
	
	//댓글을 삭제한다.
	public boolean Delete(String rno)
	{
		session.delete(namespace + ".reply_delete",rno);
		return true;
	}	
}
