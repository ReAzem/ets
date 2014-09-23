import java.awt.Color;
import java.awt.Graphics;

/****************************************
Cours:              LOG121
Session:            Automne 2014
Groupe:             03
Projet:             Exercice 1
Étudiant(e)(s)      Viau, Alexandre
Code(s) perm.:      VIAA08029409
Chargé de cours:    Dominic St-Jacques
Chargés de labo:    Alvine Boaye et Jean-Nichola Blanchet
Nom du ficher:      Bonjour.java
Date créé:          2014-09-09
Date dern. modif.:  2014-09-09
*****************************************
Historique des modificaitons
*****************************************
2014-09-09          Version initiale
*****************************************/


public abstract class Forme {

	/**
	 * Le numéro de séquence de la forme
	 */
	private int numero_sequence;

	/**
	 * La couleur de la forme
	 */
	protected Color color;

	public Forme(int numero_sequence){
		this.numero_sequence = numero_sequence;
	}

	/**
	 * Dessine la forme
	 * @param g Graphics
	 */
	protected void dessiner(Graphics g){
		g.setColor(this.color);
	}

}
