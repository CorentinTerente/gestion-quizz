package fr.diginamic.services;

import java.util.Scanner;

import fr.diginamic.dao.QuestionDao.QuestionDao;
import fr.diginamic.model.Question.Question;

public class SupprimerQuestionService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDao dao) {
		System.out.println("Saisir le numero de la question");
		int numQuestions = Integer.parseInt(scanner.nextLine());
		Question questionASuppr;
		if(!dao.findAll().isEmpty()) {
			questionASuppr = dao.findAll().get(numQuestions-1);
			dao.delete(questionASuppr);
		}
		
	}

}
