package cn.hjy.testy.Test1004;

import java.util.Scanner;

/** 
 * @author 543363559@qq.com
 * @date 2017年5月14日 上午10:40:32 
 */
class People{
	String name;
	String ID;
	int score;
	public People(){}
	
	
	
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		People[] people = new People[n];
		
		int hight = 0;
		int low = 100;
		for (int i = 0; i < n; i++) {
			people[i] = new People();
			people[i].name = sc.next();
			people[i].ID = sc.next();
			people[i].score = sc.nextInt();
			hight = hight > people[i].score ? hight:people[i].score; 
			low = low < people[i].score ? low:people[i].score; 
		}
		for (int i = 0; i < n; i++) {
			if (people[i].score == hight) {
				System.out.println(people[i].name + " " + people[i].ID);
			} 
		}
		for (int i = 0; i < n; i++) {
			if (people[i].score == low) {
				System.out.println(people[i].name + " " + people[i].ID);
			} 
		}
		
	}
}
