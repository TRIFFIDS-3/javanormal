package ื๗าตฬโ;

import java.util.Scanner;

public class S3_3_9 {

	public static void main(String[] args) {
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int i = 0;
		int sum = 0;
		for (i = 0; i < 9; i = i + 1) {
			int num = (int) (str.charAt(i)) - 48;
			sum = sum + num * (i + 1);
		}
		sum = sum % 11;
		System.out.print("The ISBN-10 number is ");
		System.out.print(str);
		if (sum == 10)
			System.out.print("X");
		else
			System.out.print(sum);
	}

}