package com.Springboot.SentEmail.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Springboot.SentEmail.Service.EmailService;
import com.Springboot.SentEmail.Service.Entity;

@RestController
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/SendMail")
	public String sendMail(@RequestBody Entity entity)
	{
		String status=emailService.sendSimpleMail(entity);
		return status;
	}
	

}
