package numbers;

import java.util.Scanner;

/**
 * Enter a number and have the program generate the Fibonacci sequence 
 * to that number or to the Nth number.
 * @author Yue
 *
 */
public class FibonacciSequence {

	//Recursion is not efficient.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if(n < 1) {
				System.out.println(0);
				continue;
			}
			if(n < 3) {
				System.out.println(1);
				continue;
			}
			int ans = 1;
			int first = 1;
			int second = 1;
			for (int i = 2; i < n; i++) {
				ans = first + second;
				first = second;
				second = ans;
			}
			System.out.println(ans);
		}
	}

}
