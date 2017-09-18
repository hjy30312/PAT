package cn.hjy.testy.Test1008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        /**
         * 取最后一位数 其他往后移一位
         * 把最后一位放入第一位
         */
        for (int i = 0; i < m; i++) {
            int temp = arr[n-1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        for (int i = 0; i < n; i++) {
            if(i == n-1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
