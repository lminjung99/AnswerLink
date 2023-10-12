package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.test.dto.ChatRequest;
import com.example.test.dto.ChatResponse;
import com.example.test.dto.UserRequest;

@RestController
@RequestMapping("/api")
public class ChatController {
	
//	@Qualifier("openaiRestTemplate")
//	@Autowired
//	private RestTemplate restTemplate;
//	
//	
//	@Value("${openai.model}")
//	private String model;
//	
//	@Value("${openai.api.url}")
//	private String apiUrl;
	
	@GetMapping("/chat")
	public String chat(@RequestParam String prompt) {
		//create request
		//ChatRequest request = new ChatRequest(model, prompt);
		System.out.println(prompt);
		return "your question is arrived : \n"+prompt;
	}
	
//	@PostMapping("/chat")
//	public String chat(@RequestBody UserRequest userRequest) {
//		return userRequest.getPrompt();
//	}
	
//	//test with gpt-3.5
//	@GetMapping("/chat")
//	public String chat(@RequestParam String prompt) {
//		
//		//create request
//		ChatRequest request = new ChatRequest(model, prompt);
//		
//		//call the API
//		ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);
//		
//		if(response==null || response.getChoices()==null || response.getChoices().isEmpty()) {
//			return "No response";
//		}
//		
//		//return the first response
//		return response.getChoices().get(0).getMessage().getContent();
//		
//	}
	

}
