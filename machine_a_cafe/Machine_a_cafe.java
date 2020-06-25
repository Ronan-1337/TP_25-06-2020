package machine_a_cafe;

import java.util.Scanner;

public class Machine_a_cafe {
	 static int eau;
	 
	 public Machine_a_cafe(int e) {
		 this.eau = e;
	 }
	 
	 public static int choix_cafe() {
		 Scanner	sc		= new Scanner(System.in);
		 
		 System.out.println("Choisissez votre type de café.");
		 System.out.println("\tPour un Espresso, tapez 1.");
		 System.out.println("\tPour un Macchiato, tapez 2.");
		 System.out.println("\tPour un Cappucino, tapez 3.");
		 System.out.println("\tPour un Moka, tapez 4.");
		 System.out.println("\tPour un Latte, tapez 5.");
		 return sc.nextInt();
	 }
	 
	 public static int taille_cafe() {
		 Scanner	sc		= new Scanner(System.in);

		 System.out.println("Choisissez votre taille de café");
		 System.out.println("\tPour un court, tapez 1");
		 System.out.println("\tPour un long, tapez 2");
		 return sc.nextInt();
	 }
	 
	 public static String disp_taille(int t) {
		 if (t == 1)
			 return "court";
		 else
			 return "long";
		 }
	 
	 public static String disp_type(int t) {
		 if(t == 1)
			 return "Espresso";
		 else if(t == 2)
			 return "Macchiato";
		 else if(t == 3)
			 return "Cappucino";
		 else if(t == 4)
			 return "Moka";
		 else 
			 return "Latte";
	 }
	 
	 public static void verif_eau(int type, int taille) {
		 if (taille == 2 && eau == 1)
			 System.out.println("Il n'y a pas asez d'eau pour un café long, eteignez la machine et remplissez le reservoir d'eau ou commandez un café court.");
		 else if (eau == 0)
			 System.out.println("Il n'y a plus d'eau dans la machine, merci d'eteindre la machine et remplir le reservoir d'eau.");
		 else {
			 eau = eau - taille;
			 System.out.println("Voici votre "+disp_type(type)+' '+disp_taille(taille)+". \nMerci d'avoir utilisé notre machine à café.\n\n");
			 }
		 }
	 
	 public static void main(String[] args) {
		 Machine_a_cafe senseo = new Machine_a_cafe(10);
		 
		 System.out.println("Bienvenue dans votre machine à café");
		 while (true)
			 senseo.verif_eau(senseo.choix_cafe(), senseo.taille_cafe());
	}

}
