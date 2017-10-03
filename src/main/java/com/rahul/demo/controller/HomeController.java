/**
 * 
 */
package com.rahul.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Exotic
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("j", "l");
		return "index";
	}
	
	@RequestMapping("/aboutus")
	public String about() {
		return "aboutus";
	}

	@RequestMapping("/header")
	public String header() {
		return "header";
	}
	@RequestMapping("/footer")
	public String footer() {
		return "footer";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/notFound")
	public String NptFound() {
		return "404";
	}
}
