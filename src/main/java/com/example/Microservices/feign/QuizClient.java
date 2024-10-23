package com.example.Microservices.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.Microservices.model.QuestionWrapper;
import com.example.Microservices.model.Response;

@FeignClient("QUESTION-SERVICE")
public interface QuizClient 
{
	@GetMapping("question/generate")
	public ResponseEntity<List<Integer>> getQuestionForQuiz(@RequestParam String categoryName, @RequestParam Integer numQuestions);
	
	@PostMapping("question/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(@RequestBody List<Integer> questionIds);
	
	
	@PostMapping("question/getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
	
}
