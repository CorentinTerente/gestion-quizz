package fr.diginamic.services;

import java.util.Scanner;
import fr.diginamic.dao.QuestionDao.QuestionDao;
import fr.diginamic.model.TypeQuestion;
import fr.diginamic.model.Question.Question;

public class ExecuterQuizzService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDao dao) {
		int nbPoints = 0;
		TypeQuestion[] lesTypes = TypeQuestion.values();
		for(Question laQuestion : dao.findAll()) {
			System.out.println((dao.findAll().indexOf(laQuestion)+1)+")  "+laQuestion.getIntitule());
			for(String proposition : laQuestion.getPropositions()) {
				System.out.println("	-"+proposition);
			}
			System.out.println("votre reponse ?");
			String reponse = scanner.nextLine();
			if(laQuestion.verifierReponse(reponse)) {
				if(laQuestion.getTypeDeQuestion().equals(lesTypes[0])) {
					nbPoints += 1;
				} else {
					nbPoints +=2;
				}
			}
			
		}
		System.out.println("Vos Points : "+nbPoints);
		
	}

}
