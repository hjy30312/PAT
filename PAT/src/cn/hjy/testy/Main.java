package cn.hjy.testy;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static int flag(int x) {
        x = (x > 0)? 1:-1;
        return x;
    }
    public static int multiply(int x, int y, int n) {
        int flag = flag(x)*flag(y);
        x = Math.abs(x);
        y = Math.abs(y);
        if (x == 0 || y == 0) {
            return 0;
        } else if (n == 1) {
            return flag * x * y;
        } else {
            //分割计算
            int A = x / (int) pow(10, n/2);
            int B = (int) (x - A*(pow(10, n / 2)));
            int C = (int) (y / pow(10, n / 2));
            int D = (int) (y - C*(pow(10, n / 2)));
            //分治计算
            int AC = multiply(A, C, n / 2);
            int BD = multiply(B, D, n / 2);
            int ABDC = multiply((A - B), (D - C), n / 2) + AC + BD;
            return (int) (flag*(AC*pow(10, n) + ABDC * pow(10, (n/2)) + BD));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(multiply(x,y,n));
        System.out.println(x*y);
        sc.close();
    }
}
