package cn.hjy.testy.Test1016;

import java.util.Scanner;

/** 
 * @author 543363559@qq.com
 * @date 2017年5月15日 下午4:35:30 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.读入
		int a = sc.nextInt();
		int flaga = sc.nextInt();
		int b = sc.nextInt();
		int flagb = sc.nextInt();
		//2.拆分
		int counta = 0, countb = 0;
		int i = 0,j = 0;
		while(a > 0) {
			if(a % 10 == flaga)	
				counta++;
			a /= 10;
		}
		while(b > 0) {
			if(b % 10 == flagb)
				countb++;
			b /= 10;
		}
		//3.得到a,b
		int ansa = 0,ansb = 0;
		for (int i2 = 0; i2 < counta; i2++) {
			ansa = ansa*10+flaga;
		}
		for (int i2 = 0; i2 < countb; i2++) {
			ansb = ansb*10+flagb;
		}
		System.out.println(ansa + ansb);
	}
}
