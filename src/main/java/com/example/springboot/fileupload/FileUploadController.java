package com.example.springboot.fileupload;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping(value = "/fileupload")
@Controller
public class FileUploadController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/index")
	public String fileUploadIndex(Model model) {
		return "fileupload/index";
	}

	@PostMapping("/upload")
	public String fileUPload(@RequestParam("file") MultipartFile file) {
		logger.info("fileUpload :: ");
		logger.info(file.getContentType());
		try {
			File fi = new File(file.getOriginalFilename());
			file.transferTo(fi);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "fileupload/fileinfo";
	}
}