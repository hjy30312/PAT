package cn.hjy.testy.Test1046;

import java.util.Scanner;

/** 
 * @author 543363559@qq.com
 * @date 2017年5月17日 下午2:07:01 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c,d;
		int ansj = 0,ansy = 0;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			
			if (a + c == b && a +c != d) {
				ansy++;
			} else if(a + c != b && a +c == d) {
				ansj++;
			}
		}
		System.out.println(ansj + " " + ansy);
	}
}
