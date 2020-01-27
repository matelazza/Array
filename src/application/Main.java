package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite um valor para n:");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for(int i = 0; i < vect.length;i++) {
			 System.out.println("Digite a altura:");
			 vect[i] = sc.nextDouble();
			 
		}
		double sum = 0.0;
		for (int i = 0; i < n;i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("Average Height: %.2f", avg);
		sc.close();
	}

}
