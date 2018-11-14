package fr.diginamic.console;
import fr.diginamic.model.Question.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizzAdminConsoleApp {
	public static void main(String[] args) {
		Scanner questionUser = new Scanner(System.in);
		int choixUser = 0;
		boolean quizz = true;
		List<Question> listeQuestions = new ArrayList<Question>();
		
		while(quizz) {
			System.out.println("veuillez entrez 1 , 2 , 3 , 4 ou 99");
			choixUser = Integer.parseInt(questionUser.nextLine());
			
			switch(choixUser) {
			//liste les questions dans la liste
				case 1: System.out.println("Liste questions");
					afficherQuestion(listeQuestions);
			break;
			//ajoute une question avec le nombre de proposition choisi 
				case 2: System.out.println("Ajout d’une nouvelle question");
					ajouterQuestion(questionUser,listeQuestions);
			break;
			//supprime une question de la liste
				case 3: System.out.println("Suppression d’une question");
					supprimerQuestion(questionUser, listeQuestions);
			break;
			//execute le quizz
				case 4: System.out.println("Exécution du quizz");
					
			break;
				case 99: System.out.println("Au revoir");
				quizz= false;
			break;
			
			}
		}
		questionUser.close();
	}
	
	public static void afficherQuestion(List<Question> listeQuestions) {
		for (Question question : listeQuestions) {
			System.out.println((listeQuestions.indexOf(question)+1)+")  "+question.getIntitule());
			for(String proposition : question.getPropositions()) {
				System.out.println("	-"+proposition);
			}
		}
	}
	
	public static void ajouterQuestion(Scanner sc,List<Question> listeQuestions) {
		System.out.println("veuillez saisir l'intitule de la question");
		String intitule = sc.nextLine();
		Question nouvelleQuestion = new Question(intitule);
		System.out.println("nombre de questions");
		int nbPropositions = Integer.parseInt(sc.nextLine());
		//ajoute le nombre de proposition choisi
		for(int i = 0; i< nbPropositions;i++) {
			System.out.println("Saisir la propostion n°"+(i+1));
			String proposition = sc.nextLine();
			nouvelleQuestion.addProposition(proposition);
		}
		
		listeQuestions.add(nouvelleQuestion);
	}
	
	public static void supprimerQuestion(Scanner sc, List<Question> listeQuestion) {
		System.out.println("Saisir le numero de la question");
		int numQuestions = Integer.parseInt(sc.nextLine());
		if(!listeQuestion.isEmpty()) {
			listeQuestion.remove(numQuestions);
		}
	}

}
