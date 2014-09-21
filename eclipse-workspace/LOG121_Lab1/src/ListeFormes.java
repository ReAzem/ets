import java.util.Iterator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;


/**
 * Une liste de 10 formes.
 * Lors d'un ajout, supprime la forme la plus ancienne si la liste est pleine.
 * @author reazem
 *
 */
public class ListeFormes implements Iterable<Forme>{
	private Forme[] formes = new Forme[10];
	private int curseur = 0;

	public ListeFormes(){
	}

	/**
	 * Ajoute une forme  dans la liste.
	 * @param forme
	 */
	public void ajouter(Forme forme){
		formes[curseur] = forme;
		curseur = (curseur == 9) ? 0 : curseur+1;
	}

	@Override
	public Iterator<Forme> iterator() {
		Iterator<Forme> iterator = new Iterator<Forme>() {
			private int currentIndex = 0;

			@Override
            public Forme next() {
				Forme f = formes[currentIndex];
				currentIndex++;
				return f;
			}

			@Override
			public boolean hasNext(){
				return currentIndex < formes.length && formes[currentIndex] != null;
			}

			@Override
            public void remove() {
                throw new NotImplementedException();
            }

		};
		return iterator;
	}


}

