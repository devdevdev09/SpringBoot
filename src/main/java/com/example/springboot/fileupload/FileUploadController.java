package com.example.springboot.fileupload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value= "/fileupload")
@Controller
public class FileUploadController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/index")
	public String fileUploadIndex(Model model){
		return "fileupload/index";
	}
}