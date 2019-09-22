package drugipaket;

import java.util.Scanner;

public class PovrsinaObim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Figura: ");
		s= sc.nextLine();
		double a, b, p, o;
		switch (s) {
		case "kvadrat": 
			System.out.print("Unesite duzinu stranice: ");
			a = sc.nextDouble();
			p = Math.pow(a, 2);
			o = a * 4;
			System.out.println("Povrsina kvadrata je " + p + " a njegov obim " + o ); break;
		case "pravougaonik": 
			System.out.print("Unesite a stranicu: ");
			a = sc.nextDouble();
			System.out.print("Unesite b stranicu: ");
			b = sc.nextDouble();
			p = a * b;
			o = 2 * ( a + b );
			System.out.println("Povrsina pravougaonika je " + p + " a njegov obim " + o ); break;
		case "krug" : 
			System.out.print("Unesite poluprecnik: ");
			a = sc.nextDouble();
			o = 2 * a * Math.PI;
			p = Math.pow(a, 2) * Math.PI;
			System.out.println("Povrsina kruga je " + p + " a njegov obim " + o); break;
		default :
			System.out.println("Pogresan unos!"); break;
		}
			
		
	}

}
