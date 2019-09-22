package drugipaket;

import java.util.Scanner;

public class Prestupna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Unesite zeljenu godinu: ");
		a = sc.nextInt();
		if ( a % 4 == 0 && ( a % 100 != 0 || a % 400 == 0)) {
			System.out.println("Godina " + a + ". jeste prestupna." );
		} 
		else {
			System.out.println("Godina " + a + ". nije prestupna." );
		}
	}
}
