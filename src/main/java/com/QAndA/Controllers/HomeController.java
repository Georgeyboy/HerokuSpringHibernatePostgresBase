package com.QAndA.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 10/02/2015.
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	String home() {
		return "index";
	}
}