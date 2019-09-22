package drugipaket;

import java.util.Scanner;

public class DaniUNedelji {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.print("Unesite broj dana u nedelji: ");
		a = sc.nextInt();
		switch (a) {
			case 1 : System.out.print("Ponedeljak."); break;
			case 2 : System.out.print("Utorak."); break;
			case 3 : System.out.print("Sreda."); break;
			case 4 : System.out.print("Cetvrtak."); break;
			case 5 : System.out.print("Petak."); break;
			case 6 : System.out.print("Subota."); break;
			case 7 : System.out.print("Nedelja."); break;
			default : System.out.print("Pogresan unos."); break;
		}
		if ( a >= 1 && a <= 5 ) System.out.print( "Do vikenda je ostalo " + ( 6 - a) + " dana.");
		if ( a == 6 || a == 7 ) System.out.print("Vikend!!!");

	}

}
