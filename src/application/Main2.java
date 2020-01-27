package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite um valor para n:");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Price:");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPreco();
		}
		double avg = sum / vect.length;
		System.out.printf("Average price : %.2f", avg);

		sc.close();
	}

}
