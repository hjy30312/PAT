package cn.hjy.testy.Test1009;

import java.util.Scanner;

public class Main {
  static String start;
  static String[] arr;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    start = sc.nextLine();
    arr = start.split(" ");
    for (int i = arr.length; i > 0; i--) {
      System.out.print(arr[i - 1]);
      if (i - 1 != 0) {
        System.out.print(" ");
      }
    }

  }
}