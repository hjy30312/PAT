package cn.hjy.testy.Test1026;

import java.util.Scanner;

/** 
 * @author 543363559@qq.com
 * @date 2017年5月15日 下午7:52:38 
 * 分析:
 * 	处理四舍五入的时候 只需要在除只前加个50则可
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int time = ((b - a) +50) / 100;
		
		int hour = time / 3600;
		int minute = time % 3600 / 60;
		int seconds = time % 60;
		System.out.printf("%02d:%02d:%02d\n",hour,minute,seconds);
	}
}
