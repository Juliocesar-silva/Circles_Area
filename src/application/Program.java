package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Radius;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double radius;
		
		radius = scan.nextDouble();
		scan.close();
		
		Radius r = new Radius(radius);
		
		System.out.printf("The area of the circle with radius %.2f is: %.2f%n",radius,r.Area());

	}

}
