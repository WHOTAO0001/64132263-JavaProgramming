/**
 * 
 */
package till.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Canh cua khoi lap phuong: ");
		double canh = scanner.nextDouble();
		double theTich = Math.pow(canh, 3);
		System.out.printf("The tich khoi lap phuong: %f\n", theTich);
		scanner.close();
	}

}
