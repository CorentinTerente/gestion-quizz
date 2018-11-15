package fr.diginamic.services;

import java.util.Scanner;

import fr.diginamic.dao.QuestionDao.QuestionDao;
import fr.diginamic.model.Question.Question;

public class AjouterQuestionService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDao dao) {
		
		System.out.println("veuillez saisir l'intitule de la question");
		String intitule = scanner.nextLine();
		Question nouvelleQuestion = new Question(intitule);
		System.out.println("nombre de questions");
		int nbPropositions = Integer.parseInt(scanner.nextLine());
		//ajoute le nombre de proposition choisi
		for(int i = 0; i< nbPropositions;i++) {
			System.out.println("Saisir la propostion n°"+(i+1));
			String proposition = scanner.nextLine();
			nouvelleQuestion.addProposition(proposition);
		}
		
		dao.save(nouvelleQuestion);
		
	}
	
}
