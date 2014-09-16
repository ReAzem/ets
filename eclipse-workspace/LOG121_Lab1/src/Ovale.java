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

public class Ovale extends Forme {
	private int centreX, centreY, rayonH, rayonV;

	public Ovale(int numero_sequence, int centreX, int centreY, int rayonH, int rayonV){
		super(numero_sequence);
		color = Color.PINK;
		this.centreX = centreX;
		this.centreY = centreY;
		this.rayonH = rayonH;
		this.rayonV = rayonV;
	}
	
	public void dessiner(Graphics g){
		super.dessiner(g);
		g.fillOval(
					centreX - rayonV,
					centreY + rayonH,
					(rayonV*2),
					(rayonH*2)
				);
	}

}
