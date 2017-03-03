package numbers;

import java.util.Scanner;

/**
 * Have the user enter a number and find all 
 * Prime Factors (if there are any) and display them.
 * @author Yue
 *
 */
public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			for (int i = 2; i < (int) Math.sqrt(n); i++) {
				if (n % i == 0 && isPrime(i)) {
					System.out.print(i + " ");
				}
			} 
		}
	}
	
	public static boolean isPrime(int i) {
		for(int j = 2; j <= Math.sqrt(i); j++) {
			if(i % j == 0) return false;
		}
		return true;
	}

}
