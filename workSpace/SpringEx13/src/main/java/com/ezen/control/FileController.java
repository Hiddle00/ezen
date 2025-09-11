package com.ezen.control;

import java.io.*;
import java.util.*;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ezen.filevo.FileVO;

@Controller
public class FileController {
	
	private final static String uploadPath = "D:\\YH\\ezen\\workSpace\\SpringEx13\\upload";
	
	@RequestMapping(value = "/upload.do")
	public String Upload() {
		return "upload";
	}
	
	@RequestMapping(value = "/uploadOK.do", method = RequestMethod.POST)
	public String UploadOK(@RequestParam("file")MultipartFile file //첨부파일 받아오는 클래스. file을 첨부파일로 첨부하라
			,Model model) throws IllegalStateException, IOException {
		
		//업로드된 원본 파일 이름 가져오기
		//tomcat소유의 임시디렉토리(temp) 서버가 리부팅되면 temp를 비운다
		String originalFileName = file.getOriginalFilename();
		System.out.println("originalFileName : " + originalFileName);
		
		//파일 이름이 중복되지 않도록 파일 이름 변경 : 서버에 저장할 이름
		// UUID 클래스 사용
		UUID uuid = UUID.randomUUID();
		String savedFileName = uuid.toString();
		System.out.println("savedFileName : " + savedFileName);
		
		//첨부파일 객체 생성
		File newFile = new File(uploadPath + "\\" + savedFileName);
		//실제 저장해야하는 폴더로 업로드 된 파일을 옮긴다.
		//실제 저장 디렉토리로 전송
		file.transferTo(newFile); //받아온 file을 newFile이 가지고있는 path에 (newFile객체에 담아서??)전송한다
		
		model.addAttribute("filename", originalFileName);
		model.addAttribute("savename", savedFileName);
		
		return "uploadok";
	}
	
	@RequestMapping(value = "/down.do")
	public void Down(@RequestParam("name")String fileName,
			@RequestParam("file")String saveName,HttpServletResponse response)
					throws IOException
	{
		File file = new File(uploadPath, saveName);
		
		// 파일명 인코딩
		String encodedFileName = new String (fileName.getBytes("UTF-8"), "ISO-8859-1");

		// file 다운로드 설정
		response.setContentType("application/download"); //응답헤더. html이 아닌 첨부파일이니 맞는 프로토콜??로 받아라
		response.setContentLength((int)file.length());
		response.setHeader("Content-Disposition", "attatchment;filename=\"" + encodedFileName + "\""); //원래 파일 이름을 지정해주는 코드
		
		// 다운로드 시 저장되는 이름은 Response Header의 "Content-Disposition"에 명시
		OutputStream os = response.getOutputStream();
		
		FileInputStream fis = new FileInputStream(file);
		FileCopyUtils.copy(fis, os);
	}

	@RequestMapping(value = "/uploadMulti.do", method = RequestMethod.POST)
	public String UploadMulti(@RequestParam("files")MultipartFile[] files
			,Model model) throws IllegalStateException, IOException {
		
		List<FileVO> list = new ArrayList<FileVO>();
		for(MultipartFile file : files) {
			//업로드된 원본 파일 이름 가져오기
			//tomcat소유의 임시디렉토리(temp) 서버가 리부팅되면 temp를 비운다
			String originalFileName = file.getOriginalFilename();
			System.out.println("originalFileName : " + originalFileName);
			
			//파일 이름이 중복되지 않도록 파일 이름 변경 : 서버에 저장할 이름
			// UUID 클래스 사용
			UUID uuid = UUID.randomUUID();
			String savedFileName = uuid.toString();
			System.out.println("savedFileName : " + savedFileName);
			
			//첨부파일 객체 생성
			File newFile = new File(uploadPath + "\\" + savedFileName);
			//실제 저장해야하는 폴더로 업로드 된 파일을 옮긴다.
			//실제 저장 디렉토리로 전송
			file.transferTo(newFile);
			
			FileVO vo = new FileVO();
			vo.setFilename(originalFileName);
			vo.setSavename(savedFileName);
			
			list.add(vo);
		}
		model.addAttribute("list", list);
		return "uploadok";
	}
	
}
