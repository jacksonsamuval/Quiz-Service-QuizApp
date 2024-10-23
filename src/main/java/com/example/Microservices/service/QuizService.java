package com.example.Microservices.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.Microservices.model.*;
import com.example.Microservices.Dao.QuizDao;
import com.example.Microservices.feign.QuizClient;
import com.example.Microservices.model.Quiz;
import com.example.Microservices.model.Response;

@Service
public class QuizService 
{
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuizClient quizInterface;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) 
	{
		List<Integer> questions = quizInterface.getQuestionForQuiz(category, numQ).getBody();
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizDao.save(quiz);
		return new ResponseEntity<>("success",HttpStatus.CREATED);
	}


	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) 
	{
		Quiz quiz = quizDao.findById(id).get();
		List<Integer> questionForUser = quiz.getQuestions();
		ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionFromId(questionForUser);
		
		return questions;
	}

	public ResponseEntity<Integer> calculate(Integer id, List<Response> responses) {
		ResponseEntity<Integer> right = quizInterface.getScore(responses);
		return right;
	}
}
