package fr.diginamic.console;

import java.util.Scanner;

public class QuizzAdminConsoleApp {
	public static void main(String[] args) {
		Scanner questionUser = new Scanner(System.in);
		int choixUser = 0;
		boolean quizz = true;
		
		while(quizz) {
			System.out.println("veuillez entrez 1 , 2 , 3 , 4 ou 99");
			choixUser = questionUser.nextInt();
			switch(choixUser) {
			case 1: System.out.println("Liste questions");
			break;
			case 2: System.out.println("Ajout d’une nouvelle question");
			break;
			case 3: System.out.println("Suppression d’une question");
			break;
			case 4: System.out.println("Exécution du quizz");
			break;
			case 99: System.out.println("Au revoir");
				quizz= false;
			break;
			}
		}
	}

}
