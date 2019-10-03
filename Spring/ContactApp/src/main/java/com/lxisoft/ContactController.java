package com.lxisoft;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  

	@Controller  
	public class ContactController {  
	@RequestMapping("/")  
	    public String display()  
	    {  
	        return "index";  
	    }     
	}  
