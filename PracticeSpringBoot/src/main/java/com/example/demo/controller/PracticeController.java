package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.PracticeForm;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/demo")
public class PracticeController {
	@RequestMapping(value="")
	public String index() {
		
		return "demo/index";
	}
	
	@RequestMapping(value="/result")
	public String result(@ModelAttribute("practiceForm") PracticeForm form, Model model) {
		System.out.println(form.getMessage());
		System.out.println(form.getDate());
		
		return "demo/result";
	}
}
