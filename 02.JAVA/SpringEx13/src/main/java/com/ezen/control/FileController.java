package com.ezen.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ezen.vo.FileVO;

@Controller
public class FileController 
{
	private final static String uploadPath = "D:\\jhjeong\\workspace\\SpringEx13\\upload";
	
	@RequestMapping(value = "/upload.do")
	public String Upload()
	{
		return "upload";
	}
	
	@RequestMapping(value = "/uploadOK.do", method = RequestMethod.POST)
	public String UploadOK(@RequestParam("file")MultipartFile file,
			Model model) throws IllegalStateException, IOException
	{
		//업로드된 원본 파일 이름 가져오기
		String originalFileName = file.getOriginalFilename();
		System.out.println("originalFileName:" + originalFileName);
		
		//파일 이름이 중복되지 않도록 파일 이름 변경 : 서버에 저장할 이름
		// UUID 클래스 사용
		UUID uuid = UUID.randomUUID();
		String savedFileName = uuid.toString();
		System.out.println("savedFileName:" + savedFileName);
		
		//첨부파일 객체 생성
		File newFile = new File(uploadPath + "\\" + savedFileName);
		
		//실제 저장 디렉토리로 전송		
		file.transferTo(newFile);
		
		model.addAttribute("filename",originalFileName);
		model.addAttribute("savename",savedFileName);
		
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
		response.setContentType("application/download");
		response.setContentLength((int)file.length());
		response.setHeader("Content-Disposition", "attatchment;filename=\"" + encodedFileName + "\"");
		
		// 다운로드 시 저장되는 이름은 Response Header의 "Content-Disposition"에 명시
		OutputStream os = response.getOutputStream();
		
		FileInputStream fis = new FileInputStream(file);
		FileCopyUtils.copy(fis, os);
	}
	
	@RequestMapping(value = "/uploadMulti.do", method = RequestMethod.POST)
	public String UploadMulti(@RequestParam("files")MultipartFile[] files,
			Model model) throws IllegalStateException, IOException
	{
		List<FileVO> list = new ArrayList<FileVO>();
		
		for(MultipartFile file : files)
		{
			//업로드된 원본 파일 이름 가져오기
			String originalFileName = file.getOriginalFilename();
			System.out.println("originalFileName:" + originalFileName);
			
			//파일 이름이 중복되지 않도록 파일 이름 변경 : 서버에 저장할 이름
			// UUID 클래스 사용
			UUID uuid = UUID.randomUUID();
			String savedFileName = uuid.toString();
			System.out.println("savedFileName:" + savedFileName);
			
			//첨부파일 객체 생성
			File newFile = new File(uploadPath + "\\" + savedFileName);
			
			//실제 저장 디렉토리로 전송		
			file.transferTo(newFile);
			
			FileVO vo = new FileVO();
			vo.setFilename(originalFileName);
			vo.setSavename(savedFileName);
			
			list.add(vo);			
		}
		
		// Model 설정 : 뷰 페이지에서 원본 파일 이름 출력
		model.addAttribute("list", list);
		
		return "uploadok";
	}
	
}
