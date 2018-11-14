package fr.diginamic.model.Question;

import java.util.ArrayList;


public class Question {
	
	private String intitule;
	private ArrayList<String> propositions;
	private String bonneReponse;
	
	
	public Question(String intitule) {
		this.intitule = intitule;
		this.propositions = new ArrayList<>();
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
		return bonneReponse.equals(reponse);
	}
	
	public void addProposition(String proposition) {
		this.propositions.add(proposition);
	}
}
