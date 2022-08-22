package com.example.user;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class UserController {
	
	 @Autowired
	    private UserService service;
 
	@RequestMapping("/")
	public ModelAndView home() {
	ModelAndView mav = new ModelAndView("index");
	
	List<User> listCustomer = service.listAll();
	
	mav.addObject("listCustomer", listCustomer);
	return mav;
	}
		
	@RequestMapping("/list")
	public ModelAndView home1() {
	ModelAndView mav = new ModelAndView("list");
	
	List<User> listCustomer = service.listAll();
	
	mav.addObject("listCustomer", listCustomer);
	return mav;
	}
	
	@RequestMapping("/new")
	public String newCustomerForm(Map<String, Object> model) {
	    User customer = new User();
	    model.put("customer", customer);
	    return "new_customer";
}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") User customer) {
	    service.save(customer);
	    return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editCustomerForm(@RequestParam long id) {
	    ModelAndView mav = new ModelAndView("edit_customer");
	    User customer = service.get(id);
	    mav.addObject("customer", customer);
	 
	    return mav;
	}
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		String userid = keyword;
	    List<User> result = service.search(keyword);
	    ModelAndView mav = new ModelAndView("search");
	    ModelAndView mav1 = new ModelAndView("error");
	    ModelAndView pos= null;
		if(keyword.equals(userid)) {
		    mav.addObject("result", result);
			mav=pos;
		}
		else {
			mav1.addObject("result", result);
			mav1=pos;
		} 
		
		return pos;
	}
	
	
	}