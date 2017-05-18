package cn.hjy.testy.Test1056;

import java.util.Scanner;

/** 
 * @author 543363559@qq.com
 * @date 2017年5月18日 上午10:30:30 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j != i)	
					ans += arr[i]*10 + arr[j];
			}
		}
		System.out.println(ans);
	}
	
}
