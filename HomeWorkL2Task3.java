package by.epam.JB25.lesson2;

import java.util.Scanner;

public class HomeWorkL2Task3 {

	public static void main(String[] args) {

		double R = 0;
		double L, S;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter radius R:");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		R = sc.nextDouble();
		
		L = 2 * Math.PI * R;
		S = Math.PI * Math.pow(R, 2);
		
		System.out.println("L = " + L + ", S = " + S);

		sc.close();
	}

}
