package com.sanghui.bandingpro;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BandingProApplication {

	public static void main(String[] args) {
		SpringApplication.run(BandingProApplication.class, args);
	}

	@Controller
	@AllArgsConstructor
	public class WebController {

		@GetMapping("/")
		public String main(){

			return "index";
		}
	}


}
