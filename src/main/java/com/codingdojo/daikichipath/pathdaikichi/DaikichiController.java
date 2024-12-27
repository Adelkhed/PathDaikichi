package com.codingdojo.daikichipath.pathdaikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")



public class DaikichiController {
	@RequestMapping("")
	public String  welcome() {
		return "Welcom to to Daikichi";
		
	}
	
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon to  "+ city;
		
	}
	@RequestMapping("/lotto/{number}")
	public String travel(@PathVariable("number") int number) {
		if(number % 2 ==0){
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {
			return "ou have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			
		}
		
	}

	
}
