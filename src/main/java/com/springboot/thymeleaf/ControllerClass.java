package com.springboot.thymeleaf;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClass {
	//        http://localhost:8080/about
	

	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler......");
		
		// putting data in Model object
		model.addAttribute("name","Kaleem Ashraf");
		model.addAttribute("currentDate", new Date());
		
		
		return "about";  //about.html
	}
	
	@GetMapping("/loop")
	public String iterate(Model m) {
		System.out.println("Inside iterate handler....... ");
		
		// we can use Collection by any dataTypes like List,Set,Map to iterate
		List<String> list = List.of("Kaleem Ashraf","Sifat Zehra","Amman Siddique","Ramsha Praveen");
				
		m.addAttribute("name",list);
		
		return "iterate";
		
	}
	    
	    @GetMapping("/condition")
		public String conditionHandler(Model m) {
	    	System.out.println("Inside condition handler......");
	    	
	    	m.addAttribute("isActive",true);
	    	m.addAttribute("gender", 'F');
	    	
	    	List<Integer> list = List.of(956949723,652627961,647346324);
	    	
	        m.addAttribute("myList", list);
	    	
			return "Condition";
		}
	    
	    // handler for including fragments
	    
	    @GetMapping("/service")
	    public String serviceHandler(Model m) {
	    	m.addAttribute("title","This is Title");
	    	m.addAttribute("subtitle",new Date());
	    	return "service";
	    }
	    
	    
}


