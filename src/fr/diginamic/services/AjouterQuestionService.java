package fr.diginamic.services;

import java.util.Scanner;
import fr.diginamic.dao.QuestionDao.QuestionDao;
import fr.diginamic.exceptions.AjouterQuestionException;
import fr.diginamic.model.TypeQuestion;
import fr.diginamic.model.Question.Question;

public class AjouterQuestionService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, QuestionDao dao) throws AjouterQuestionException {
		System.out.println("Question SIMPLE ou BONUS ?");
		String typeQuestion = scanner.nextLine();
		System.out.println("veuillez saisir l'intitule de la question");
		String intitule = scanner.nextLine();
		if(intitule.isEmpty()) {
			throw new AjouterQuestionException("L'intitule ne doit pas etre vide");
		}
		Question nouvelleQuestion = new Question(intitule);
		nouvelleQuestion.setTypeDeQuestion(TypeQuestion.valueOf(typeQuestion));
		System.out.println("nombre de questions");
		int nbPropositions = Integer.parseInt(scanner.nextLine());
		//ajoute le nombre de proposition choisi
		if(nbPropositions < 2) {
			throw new AjouterQuestionException("le nombre de question doit etre superieur a 2");
		}
		for(int i = 0; i< nbPropositions;i++) {
			System.out.println("Saisir la propostion n°"+(i+1));
			String proposition = scanner.nextLine();
			nouvelleQuestion.addProposition(proposition);
		}
		System.out.println("La bonne reponse est  :");
		String bonneReponse=scanner.nextLine();
		nouvelleQuestion.setBonneReponse(bonneReponse);
		dao.save(nouvelleQuestion);
		
	}
}
