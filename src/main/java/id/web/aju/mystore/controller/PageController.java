package id.web.aju.mystore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	//See dispatcher-servlet.xml on Spring view resolver to know the base folder of the page
	
	//Home
	@RequestMapping(value={"/", "/home"})
	public String home(){
		return "index";
	}
	//Sample load page under another folder, format {FOLDER_NAME}/{PAGE_NAME}
	@RequestMapping(value="/hello")
	public String hello(){
		return "hello/index";
	}

}
