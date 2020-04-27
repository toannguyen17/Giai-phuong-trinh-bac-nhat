package app;

import java.util.Scanner;

public class App {
	public static void main(final String[] args) throws Exception {
		System.out.println("Linear Equation Resolver");
		System.out.println("Given a equation as 'Ax + B = 0', please enter constants:");

		final Scanner scanner = new Scanner(System.in);

		System.out.print("A: ");
		final double a = scanner.nextDouble();

		System.out.print("B: ");
		final double b = scanner.nextDouble();

		if (a != 0) {
			final double solution = -b / a;
			System.out.println("The solution is: " + solution);
		} else {
			if (b == 0) {
				System.out.println("The solution is all x!");
			}else{
				System.out.println("No solution!");
			}
		}
	}
}
