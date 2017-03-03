package numbers;

import java.io.IOException;
import java.util.Scanner;

/**
 * Enter a number and have the program generate 
 * PI up to that many decimal places. 
 * Keep a limit to how far the program will go.
 * @author Yue
 *
 */
public class FindPIToTheNthDigit {
	
	static final int MAX = 15;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if (n > MAX)
				n = MAX;
			double ans = Math.floor(Math.PI * Math.pow(10, n)) / Math.pow(10, n);
			System.out.println(ans);
		}
	}

}
