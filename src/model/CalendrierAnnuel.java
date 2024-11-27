package model;

public class CalendrierAnnuel {

	public CalendrierAnnuel() {
		int[] calendrier = [31,28,31,30,31,30,31,31,30,31,30,31];
	}
	
	public boolean estLibre(int jour,int mois) {
		return estLibre(jour);
	}
	
	public boolean reserver(int jour,int mois) {
		
	}
	
	
	
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom,int nbJours) {
			this.jours = new boolean[nbJours]; 
			this.nom = nom;
		}
		
		private boolean estLibre(int jour) {
			return !jours[jour];
		}
		
		private void reserver(int jour) {
			jours[jour]=true;
		}
	}
	
	
	
}
