package fr.diginamic.dao.QuestionDao;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.model.Question.Question;

public class QuestionMemDao implements QuestionDao{
	List<Question> listeQuestion = new ArrayList<>();
	@Override
	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return listeQuestion;
	}

	@Override
	public void save(Question question) {
		this.listeQuestion.add(question);
		
	}

	@Override
	public void delete(Question question) {
		this.listeQuestion.remove(question);
		
	}
	
}
