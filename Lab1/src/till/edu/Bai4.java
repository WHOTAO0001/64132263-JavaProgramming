/**
 * 
 */
package till.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("So a: ");
		double soA = scanner.nextDouble();
		System.out.print("So b: ");
		double soB = scanner.nextDouble();
		System.out.print("So c: ");
		double soC = scanner.nextDouble();
		double delta = Math.pow(soB, 2) - 4 * soA * soC;
		double canDelta = Math.sqrt(delta);
		System.out.printf("Can Delta: %f", canDelta);
		scanner.close();
	}

}
