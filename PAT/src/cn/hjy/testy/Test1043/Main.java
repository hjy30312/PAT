package cn.hjy.testy.Test1043;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

/** 
 * @author 543363559@qq.com
 * @date 2017年5月17日 上午9:23:20 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int [6];
		for (int i = 0; i < str.length(); i++) {
			if ('P' == str.charAt(i)) {
				arr[0]++;
			} else if ('A' == str.charAt(i)) {
				arr[1]++;
			} else if ('T' == str.charAt(i)) {
				arr[2]++;
			} else if ('e' == str.charAt(i)) {
				arr[3]++;
			} else if ('s' == str.charAt(i)) {
				arr[4]++;
			} else if ('t' == str.charAt(i)) {
				arr[5]++;
			}
		}
		
		while(true) {
			if(arr[0] != 0) {
				System.out.printf("P");
				arr[0]--;
			} 
			if(arr[1] != 0) {
				System.out.printf("A");
				arr[1]--;
			} 
			if(arr[2] != 0) {
				System.out.printf("T");
				arr[2]--;
			} 
			if(arr[3] != 0) {
				System.out.printf("e");
				arr[3]--;
			} 
			if(arr[4] != 0) {
				System.out.printf("s");
				arr[4]--;
			} 
			if(arr[5] != 0) {
				System.out.printf("t");
				arr[5]--;
			} 
			if(arr[1] == 0 && arr[2] == 0 && arr[3] == 0 &&
					arr[4] == 0 && arr[5] == 0) {
				break;
			}
		}
	}
}
