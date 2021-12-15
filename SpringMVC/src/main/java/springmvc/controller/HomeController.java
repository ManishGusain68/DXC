package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.Model.User;

@Controller
public class HomeController {
	// handler methods
	@ModelAttribute
	public void commonDataForModel(Model model){
		model.addAttribute("Desc","Learn with Manish");	
	}
	
	@RequestMapping("/home")
	public RedirectView home() {
		
		RedirectView rv=new RedirectView();
		rv.setUrl("hello");

		return rv;
	}

	@RequestMapping("/hello")
	public String hello(Model model) {
		// Sending data from controller to jsp
		model.addAttribute("First", "Manish Gusain");
		

		return "hello";
	}

	@RequestMapping("/print")
	public ModelAndView print() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("First", "Samar");
		

		LocalDateTime ld = LocalDateTime.now();
		mv.addObject("currentTime", ld);
		mv.setViewName("hello");
		
		return mv;

	}

	@RequestMapping("/contact")
	public String contact(Model mv) {
		
		return "contact";
	}

	// @RequestMapping(path="/processForm", method= RequestMethod.POST)
	// public String handleForm(@RequestParam("fullName") String name,
	// @RequestParam("email") String email, Model model){
	// System.out.println(name);
	// System.out.println(email);
	// model.addAttribute("name",name);
	// model.addAttribute("email", email);
	//
	//
	//
	// return "success";
	// }
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user) {
		System.out.println(user);
		
			return "success";
	}

}
