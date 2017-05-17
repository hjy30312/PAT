package cn.hjy.testy.Test1021;

import java.util.Scanner;


public class Main {
	static int[] book = new int [10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			book[str.charAt(i) - 48]++;
		}
		
		for (int i = 0; i < 10; i++) {
			if (book[i] != 0) {
				System.out.println(i + ":" + book[i]);
			}
		}
	}
}
