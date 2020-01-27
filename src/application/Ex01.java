package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Ex01 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		Rent[] vect = new Rent[10];
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			
			System.out.println("Name: ");			
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[i] = new Rent(name,email);
		}
		System.out.println();
		System.out.println("Busy Rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + " : " + vect[i]);
			}
		}
		sc.close();
	}
}
