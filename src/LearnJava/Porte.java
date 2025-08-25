package LearnJava;

public class Porte extends Bloc{
	
	private boolean verrouille;
	
	Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouille) {
		super(longueur, largeur, hauteur);
		this.verrouille = verrouille;
	}
	
	public boolean estVerrouilee() {
		return this.verrouille;
	}
}
