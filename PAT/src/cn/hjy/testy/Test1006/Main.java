package cn.hjy.testy.Test1006;

import java.util.Scanner;

/** 
 * @author 543363559@qq.com
 * @date 2017年5月17日 上午9:13:38 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int [4];
		int i = 0;
		while(a > 0) {
			arr[i++] = a % 10;
			a /= 10;
		}
		for(int j = 0; j < arr[2]; j++) {
			System.out.printf("B");
		}
		for(int j = 0; j < arr[1]; j++) {
			System.out.printf("S");
		}
		for (int j = 1; j < arr[0] + 1;  j++) {
			System.out.printf("%d",j);
		}
	}
}
