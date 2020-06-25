package Pair;

import java.util.Scanner;

public class Pair {

	public static void run() {
		int n1,n2, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenue dans le programme qui donne les nombres pairs entre 2 nombres.");
		System.out.println("Entrez le petit nombre.");
		n1 = sc.nextInt();
		System.out.println("Entrez le grand nombre.");
		n2 = sc.nextInt();
		System.out.println("Entre "+n1+" et "+n2+", les nombres pairs sont :");
		for(i = n1+1; i != n2; i++) {
			if(i%2 == 0)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		run();
	}

}
