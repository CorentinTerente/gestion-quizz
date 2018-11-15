package fr.diginamic.services;

import java.util.Scanner;

import fr.diginamic.dao.QuestionDao.QuestionDao;
import fr.diginamic.model.Question.Question;

public class ListerQuestionsService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDao dao) {
		for (Question question : dao.findAll()) {
			System.out.println((dao.findAll().indexOf(question)+1)+")  "+question.getIntitule());
			for(String proposition : question.getPropositions()) {
				System.out.println("	-"+proposition);
			}
		}
		
	}

}
