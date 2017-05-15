package cn.hjy.testy.Test1002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int ans = 0;
		for (int i = 0; i < n.length(); i++) {
			ans +=  Integer.parseInt(n.substring(i,i+1));
		}
	
		List<Object> list = new ArrayList<Object>();
		int i = 0;
		if( ans == 0) {
			System.out.print("ling");
			return;
		}
		while ( ans > 0) {
			list.add(ans % 10);// = ans % 10;
			ans /= 10;
		}
		for (int j = list.size()-1; j >= 0; j--) {
			if (list.get(j).equals(0)) {
				System.out.print("ling");
			} else if (list.get(j).equals(1)) {
				System.out.print("yi");
			} else if (list.get(j).equals(2)) {
				System.out.print("er");				
			} else if (list.get(j).equals(3)) {
				System.out.print("san");
			} else if (list.get(j).equals(4)) {
				System.out.print("si");
			} else if (list.get(j).equals(5)) {
				System.out.print("wu");
			} else if (list.get(j).equals(6)) {
				System.out.print("liu");
			} else if (list.get(j).equals(7)) {
				System.out.print("qi");
			} else if (list.get(j).equals(8)) {
				System.out.print("ba");
			} else if (list.get(j).equals(9)) {
				System.out.print("jiu");
			}
			if ( j != 0) {
				System.out.print(" ");
			} 
		}
	}
	
}
