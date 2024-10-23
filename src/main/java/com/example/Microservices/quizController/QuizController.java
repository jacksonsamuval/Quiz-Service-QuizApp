package com.example.Microservices.quizController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Microservices.model.*;
import com.example.Microservices.model.Response;
import com.example.Microservices.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController 
{
	@Autowired
	QuizService quizService;
	
	@PostMapping("create")
	public ResponseEntity<String> createQuiz(@RequestBody QuizDdo quizddo)
	{
		return quizService.createQuiz(quizddo.getCategory(),quizddo.getNumQ(),quizddo.getTitle());
	}
	
	@PostMapping("getQuiz/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id) {
	    return quizService.getQuizQuestions(id);
	}

	@PostMapping("submit/{id}")
	public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id,@RequestBody List<Response> responses)
	{
		return quizService.calculate(id, responses);
	}
	
}
