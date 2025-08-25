package LearnJava;

public class Mur extends Bloc {

	private boolean porteur;
	
	Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
		super(longueur, largeur, hauteur);
		this.porteur = porteur;
	}
	
	public boolean estTraversable() {
		return !this.porteur;
	}
	
}
