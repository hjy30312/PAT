package cn.hjy.testy.Test1012;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     int n;
     int[] arr = new int[6];
     boolean[] ar = new boolean[6];
     int flag2 = -1, flag4 = 0;
     int temp,t;
     double ansarr4;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (int i = 0; i < n; i++) {    
      t = sc.nextInt();
      temp = t % 5;
      if (temp == 0 && t % 2 == 0) {
        ar[1] = true;
        arr[1] += t;
      } else if (temp == 1) {
        ar[2] = true;
        flag2 *= -1;
        arr[2] += t * flag2;
      } else if (temp == 2) {
        ar[3] = true;
        arr[3]++;
      } else if (temp == 3) {
        ar[4] = true;
        flag4++;
        arr[4] += t;
      } else if (temp == 4) {
        ar[5] = true;
        arr[5] = t > arr[5] ? t : arr[5];
      }
    }
    ansarr4 = arr[4]*1.0 / flag4;
    for (int i = 1; i < 4; i++) {
      if (ar[i]) {
        System.out.print(arr[i]+ " ");
      } else {
        System.out.print("N ");
      }
    }
    if (ar[4]) {
      System.out.printf("%.1f" + " ", ansarr4);      
    } else {
      System.out.print("N ");
    }
    if (ar[5]) {
      System.out.print(arr[5]);
    } else {
      System.out.print("N");
    }
  }
}