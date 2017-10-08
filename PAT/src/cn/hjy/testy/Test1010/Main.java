package cn.hjy.testy.Test1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = false;

        while (sc.hasNext()) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            if (x * n != 0) {
                if (flag) {
                    System.out.print(" ");
                } else {
                    flag = true;
                }
                System.out.print(x * n + " " + (n-1));
            }
        }
        sc.close();

        //“零多项式”的指数和系数都是0，但是表示为“0 0”。
        if (!flag) {
            System.out.print("0 0");
        }
    }
}
