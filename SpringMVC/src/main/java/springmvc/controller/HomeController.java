package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	//handler methods
	@RequestMapping("/home")
	public String home(){
		
		return "home";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model){
		//Sending data from controller to jsp
		model.addAttribute("First", "Manish Gusain");
		model.addAttribute("Second", "Sanjeeta Gusain");
		return "hello";
	}
	
	@RequestMapping("/print")
	public ModelAndView print(){
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("First","Samar");
		
		LocalDateTime ld=LocalDateTime.now();
		mv.addObject("currentTime", ld);
		mv.setViewName("hello");
		return mv;
		
	}

}
