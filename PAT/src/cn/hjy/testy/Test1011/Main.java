package cn.hjy.testy.Test1011;

import java.util.Scanner;

/** 
 * @author 543363559@qq.com
 * @date 2017年5月14日 下午3:35:49 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long c = sc.nextInt();
			if (a + b > c) {
				System.out.println("Case #" + i + ": true");
			} else {
				System.out.println("Case #" + i + ": false");
			}
		}
	}
}
