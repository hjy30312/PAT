package cn.hjy.testy.Test1007;

import java.util.*;

public class Main {
    static int n;
    static int ans = 0;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == 2) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}