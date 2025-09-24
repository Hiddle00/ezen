/************************************
 * 클래스 기능 : 게시판 C/R/U/D 처리 클래스
 * 작성자 : 최연흠
 * 작성일 : 2025.09.16
 ************************************/
package com.ezen.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.vo.*;

@Service
public class BoardService {

	@Autowired
	private SqlSession session;
	private static final String namespace = "mapper.board";
	
	//게시물 정보를 등록한다.
	//return true : 등록 성공, false : 등록 실패
	public boolean Insert(BoardVO vo) {
		session.insert(namespace + ".insert", vo);
		return true;		
	}
	//게시물 정보를 읽는다.	
	//IsHit = true : 조회수 증가, false : 조회수 증가 안함.
	public BoardVO Read(String no,boolean IsHit)
	{
		BoardVO vo = session.selectOne(namespace + ".view",no);
		
		if(IsHit == true)
		{
			session.update(namespace + ".hit",no);
		}
		return vo;
	}	
	//게시물 정보를 변경한다.
	//return true : 변경 성공, false : 변경 실패
	public boolean Update(BoardVO vo) {
		session.update(namespace + ".update", vo);
		return true;
	}
	//게시물 정보를 삭제한다.
	public boolean Delete(String no) {
		//해당 게시물의 댓글 전체를 삭제
		session.delete(namespace + ".delete_reply", no);
		//해당 게시물을 삭제
		session.delete(namespace + ".delete", no);
		return true;
	}
	
	//전체 게시물의 갯수를 얻는다.
	public int GetTotal(SearchVO vo) {
		return session.selectOne(namespace + ".total", vo);
	}
	
	//게시물의 목록을 읽는다.
	public List<BoardVO> GetList(SearchVO vo) {
		List<BoardVO> list = session.selectList(namespace + ".list", vo);
		return list;
	}
	
	
}
