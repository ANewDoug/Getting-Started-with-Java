
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double x1, x2, x3, x4, mean;
		
		System.out.print("Please enter value 1: ");
		x1 = sc.nextDouble();
		System.out.println();

		System.out.print("Please enter value 2: ");
		x2 = sc.nextDouble();
		System.out.println();

		System.out.print("Please enter value 3: ");
		x3 = sc.nextDouble();
		System.out.println();

		System.out.print("Please enter value 4: ");
		x4 = sc.nextDouble();
		System.out.println();
		
		mean = ((x1+x2+x3+x4)/4);

		System.out.println("Mean of above values is: " + mean);
		
		sc.close();

	}
}
