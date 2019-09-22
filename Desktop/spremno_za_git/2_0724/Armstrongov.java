package drugipaket;

import java.util.Scanner;

public class Armstrongov {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0, m, b;
		System.out.print("Unesite broj: ");
		i = sc.nextInt();
		b = i;
		while(i > 0) {
			m = i % 10;
			sum += Math.pow(m, 3);
			i /= 10;
		}
		if ( sum == b ) System.out.println("Broj " + b + " jeste Armstrongov.");
		else System.out.println("Broj " + b + " nije Armstrongov.");
		
	}

}
