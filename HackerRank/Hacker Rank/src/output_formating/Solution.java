package output_formating;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			sc.next();
			String s1 = sc.next();
			sc.close();
			int x = sc.nextInt();
			
			System.out.println(s1 + x);
			System.out.println(s1 + x);
			System.out.println(s1 + x);
			
		}
	}

}
