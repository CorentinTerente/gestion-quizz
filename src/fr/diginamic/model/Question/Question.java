package fr.diginamic.model.Question;

import java.util.ArrayList;


public class Question {
	
	private String intitule;
	private ArrayList<String> propositions;
	private String bonneReponse;
	
	
	public Question(String intitule) {
		this.intitule = intitule;
	}
	
	
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public ArrayList<String> getPropositions() {
		return propositions;
	}
	public void setPropositions(ArrayList<String> propositions) {
		this.propositions = propositions;
	}
	public String getBonneReponse() {
		return bonneReponse;
	}
	public void setBonneReponse(String bonneReponse) {
		this.bonneReponse = bonneReponse;
	}
	
	public boolean verifierReponse(String reponse) {
		boolean bonneReponse = false;
		if(reponse.equals(this.bonneReponse)) {
			bonneReponse = true;
		}
		return bonneReponse;
	}
	
	public void addProposition(String proposition) {
		this.propositions.add(proposition);
	}
}
