package cn.hjy.testy.Test1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String two = sc.nextLine();
        String three = sc.nextLine();
        String four = sc.nextLine();
        
        sc.close();

        boolean isDay = false;
        boolean isHour = false;

        for (int i = 0; i < one.length() && i <two.length(); i++) {
            if (one.charAt(i) == two.charAt(i)) {
                if (!isDay && !isHour) {

                }
            }
        }
    }

}
