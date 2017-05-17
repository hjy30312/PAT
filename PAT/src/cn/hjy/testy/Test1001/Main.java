package cn.hjy.testy.Test1001;
import java.util.Scanner;


public class Main{
  public static void main(String[] args) {
	  int count = 0;
	    Scanner sc = new Scanner(System.in);
	    double n = sc.nextInt();
	    while(n != 1) {
	      if (n % 2 == 0) {  
	        n /= 2;
	      } else {
	        n = (3*n+1) / 2;
	      }
	      count++;
	    }
	    System.out.println(count);
}
}