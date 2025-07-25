package LearnJava;

public class Main {

	public static void main(String[] args) {
		int[] tableau = {26, 10, 1985, 0, 12, 11, 1955};
		int cpt = 0;
		
		for (int entier : tableau) {
			if (entier == 0) {
				cpt++;
			}
		}
		System.out.println(cpt);
	}
	
	public static void affichage(final String text) {
		System.out.println("Bonjour " + text);
	}
}
