/**
 * 
 */
package com.springcore.MVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 */
@Controller
public class HomeController {
	
//	@RequestMapping("/home")
//	public String home() {
//		return "Home";
//	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		User user =new User(101,"Abdul","Punjab");
		model.addAttribute("userDetails",user);
		return "Home";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/user")
	public String user(Model model) {

	    List<UserList> users = new ArrayList<>();

	    users.add(new UserList(101, "Abdul", "Punjab"));
	    users.add(new UserList(102, "Supriya", "Delhi"));
	    users.add(new UserList(103, "Alok", "Mumbai"));

	    model.addAttribute("userlist", users);

	    return "userlist";
	}

}
