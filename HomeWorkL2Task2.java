package by.epam.JB25.lesson2;

import java.util.Scanner;

public class HomeWorkL2Task2 {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;
		double var1, var2, var3, rez;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		while (!scan.hasNextInt()) {
			scan.next();
		}
		a = scan.nextInt();
		
		System.out.println("Enter b: ");
		while (!scan.hasNextInt()) {
			scan.next();
		}
		b = scan.nextInt();
		
		System.out.println("Enter c: ");
		while (!scan.hasNextInt()) {
			scan.next();
		}
		c = scan.nextInt();
		
		var1 = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		var2 = 2 * a;
		var3 = Math.pow(a, 3) + b;
		
		if (var2 != 0) {
			rez = var1 / var2 - var3;
			System.out.println("rez = " + rez);
		} else {
			System.out.println("Dividing by 0!");
			var2 = Double.NaN;
		}

		scan.close();
	}

}
