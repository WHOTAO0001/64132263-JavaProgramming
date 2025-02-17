/**
 * 
 */
package till.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		String hoTen = scanner.nextLine();
		System.out.print("Diem trung binh: ");
		double diemTrungBinh = scanner.nextDouble();
		System.out.printf("%s %f diem", hoTen, diemTrungBinh);
		scanner.close();
	}

}
