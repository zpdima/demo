package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class GreetingController {

//	@RequestMapping("/")
//	public String helloWorld() {
//		System.out.println(" --- get helloWorld ");
//		return "Greetings from Spring Boot!";
//	}
	
	
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    	System.out.println(" --- get greeting ");
        model.addAttribute("name", name);
        return "greeting";
    }
}
