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
Date créé:          2014-09-14
Date dern. modif.:  2014-09-14
 *****************************************
Historique des modificaitons
 *****************************************
2014-09-14          Version initiale
 *****************************************/

public class Ligne extends Forme {
	private int x1, y1, x2, y2;

	public Ligne(int numero_sequence, int x1, int y1, int x2, int y2){
		super(numero_sequence);
		color = Color.MAGENTA;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void dessiner(Graphics g){
		super.dessiner(g);
		g.drawLine(x1, y1, x2, y2);
	}

}
