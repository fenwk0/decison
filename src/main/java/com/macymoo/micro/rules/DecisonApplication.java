package com.macymoo.micro.rules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;



@SpringBootApplication
public class DecisonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecisonApplication.class, args);
	}


}
