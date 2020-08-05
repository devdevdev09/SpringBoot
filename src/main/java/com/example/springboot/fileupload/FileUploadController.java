package com.example.springboot.fileupload;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping(value = "/fileupload")
@Controller
public class FileUploadController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/index")
	public String fileUploadIndex(Model model) {
		return "fileupload/index";
	}

	@Value("${FILE_UPLOAD_PATH}")
	String FILE_UPLOAD_PATH;

	@PostMapping("/upload")
	public String fileUPload(@RequestParam("file") MultipartFile file,
						Model model) {
		try {
			File dir = new File(FILE_UPLOAD_PATH);

			// upload directory 체크
			if(!dir.exists()){
				if(dir.mkdir()){ // directory 생성
					logger.info("디텍토리 생성 성공");
				}else{
					logger.info("디텍토리 생성 실패");
				}
				logger.info("업로드 디텍토리 생성");
			}else{
				logger.info("업로드 디텍토리 존재");
			}

			// 업로드 경로 + 파일이름
			File uploadPath = new File(FILE_UPLOAD_PATH + file.getOriginalFilename());
			file.transferTo(uploadPath);	// 임시 파일을 업로드 위치로 이동

			model.addAttribute("result","file upload 성공");
		} catch (IllegalStateException e) {
			e.printStackTrace();
			model.addAttribute("result","file upload 실패(IllegalStateException) :: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("result","file upload 실패(IOException) :: " + e.getMessage());
		}

		return "fileupload/fileinfo";
	}
}