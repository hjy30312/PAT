package cn.hjy.testy.Test1036;

import java.util.Scanner;

/** 
 * 第一行和最后一行的输出与中间分开
 * 四舍五入取整的实现，如果n是偶数，结果就是n/2 如果是奇数则为n/2+1 
 * @author 543363559@qq.com
 * @date 2017年5月18日 上午10:57:02 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String c = sc.next();
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
		int h = n%2==0 ? n/2 : n/2+1; 
		for (int j = 0; j < h -2; j++) {
			System.out.println();
			for (int i = 0; i < n; i++) {
				if(i == 0 || i == n-1) {
					System.out.print(c);
				} else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
	}
}
