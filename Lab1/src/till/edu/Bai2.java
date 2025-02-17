/**
 * 
 */
package till.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Canh 1: ");
		double canh1 = scanner.nextDouble();
		System.out.print("Canh 2: ");
		double canh2 = scanner.nextDouble();
		double chuVi = 2 * (canh1 + canh2);
		double dienTich = canh1 * canh2;
		double canhNho = Math.min(canh1,  canh2);
		System.out.printf("Chu vi: %f\n", chuVi);
		System.out.printf("Dien tich: %f\n", dienTich);
		System.out.printf("Canh nho hon: %f\n", canhNho);
		scanner.close();
	}

}
