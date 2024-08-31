package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
		User user = userService.findbyUsername(username);
		if(user != null && user.getPassword().equals(password)) {
			model.addAttribute("user",user);
			return "redirect:/dashboard";
		}
		else {
			model.addAttribute("error","Invalid username or password");
			return "login";
		}
	}


	
//	@PostMapping("/login")
//	public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
//	    User user = userService.findbyUsername(username);
//	    if(user != null && user.getPassword().equals(password)) {
//	        model.addAttribute("user", user);
//	        return "redirect:/dashboard";
//	    } else {
//	        model.addAttribute("error", "Invalid username or password");
//	        return "login";
//	    }
//	}

	
}
