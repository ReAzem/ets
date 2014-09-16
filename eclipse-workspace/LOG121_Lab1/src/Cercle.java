import java.awt.Color;
import java.awt.Graphics;


public class Cercle extends Forme {
	int centreX, centreY, rayon;

	public Cercle(int numero_sequence, int centreX, int centreY, int rayon){
		super(numero_sequence);
		color = Color.GREEN;
		this.centreX = centreX;
		this.centreY = centreY;
		this.rayon = rayon;
	}

	public void dessiner(Graphics g){
		super.dess iner(g);
		g.fillOval(
					centreX - rayon,
					centreY + rayon,
					(rayon*2),
					(rayon*2)
				);
	}

}
