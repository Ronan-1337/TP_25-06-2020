package Calculatrice;

import java.util.Scanner;

public class Calc {
	public static int	n1,n2;
	public static String op;
	
	public static void calcul() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenue dans une calculatrice simple.");
		System.out.println("Entrez l'opérateur.");
		op = sc.nextLine();
		System.out.println("Entrez le premier nombre.");
		n1 = sc.nextInt();
		System.out.println("Entrez le second nombre.");
		n2 = sc.nextInt();
		switch(op.charAt(0)) {
		case '+':
			add(n1, n2);
			break;
		case '-':
			sub(n1, n2);
			break;
		case '*':
			mul(n1, n2);
			break;
		case '/':
			div(n1, n2);
			break;
		}
	}

	public static void add(int i1, int i2) {
		System.out.println("Le resultat de l'opération "+n1+' '+op+' '+n2+" est : "+(n1+n2)+'.');
	}
	
	public static void sub(int i1, int i2) {
		System.out.println("Le resultat de l'opération "+n1+' '+op+' '+n2+" est : "+(n1-n2)+'.');
	}
	
	public static void mul(int i1, int i2) {
		System.out.println("Le resultat de l'opération "+n1+' '+op+' '+n2+" est : "+(n1*n2)+'.');
	}
	
	public static void div(int i1, int i2) {
		if (i2 != 0)
			System.out.println("Le resultat de l'opération "+n1+' '+op+' '+n2+" est : "+(n1/n2)+'.');
		else
			System.out.println("On ne peux pas diviser par 0.");
	}
	
	public static void main(String[] args) {
		Calc.calcul();
	}
}
