package fr.diginamic.console;
import fr.diginamic.dao.QuestionDao.QuestionDao;
import fr.diginamic.services.*;
import fr.diginamic.dao.QuestionDao.QuestionMemDao;
import fr.diginamic.exceptions.AjouterQuestionException;
import fr.diginamic.exceptions.SupprimerQuestionException;

import java.util.Scanner;

public class QuizzAdminConsoleApp {
	public static void main(String[] args) {
		Scanner questionUser = new Scanner(System.in);
		int choixUser = 0;
		boolean quizz = true;
		QuestionDao listeQuestions = new QuestionMemDao();
		
		while(quizz) {
			System.out.println("veuillez entrez 1 , 2 , 3 , 4 ou 99");
			choixUser = Integer.parseInt(questionUser.nextLine());
			
			switch(choixUser) {
			//liste les questions dans la liste
				case 1: System.out.println("Liste questions");
					ListerQuestionsService listerQuestion = new ListerQuestionsService();
					listerQuestion.executeUC(questionUser, listeQuestions);
			break;
			//ajoute une question avec le nombre de proposition choisi 
				case 2: System.out.println("Ajout d’une nouvelle question");
					AjouterQuestionService ajoutQuestion = new AjouterQuestionService();
					try {
						ajoutQuestion.executeUC(questionUser, listeQuestions);
					} catch(AjouterQuestionException e) {
						System.out.println("L'intitule ne doit pas etre vide / le nombre de proposition doit etre au moins 2");
					}
			break;
			//supprime une question de la liste
				case 3: System.out.println("Suppression d’une question");
					SupprimerQuestionService supprQuestion = new SupprimerQuestionService();
					try {
						supprQuestion.executeUC(questionUser, listeQuestions);
					} catch (SupprimerQuestionException e) {
						System.out.println("Cette question n'existe pas");
					}
			break;
			//execute le quizz
				case 4: System.out.println("Exécution du quizz");
					ExecuterQuizzService execQuizz = new ExecuterQuizzService();
					execQuizz.executeUC(questionUser, listeQuestions);
			break;
				case 99: System.out.println("Au revoir");
				quizz= false;
			break;
			
			}
		}
		questionUser.close();
	}
	

}
