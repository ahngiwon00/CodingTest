package CodeUp.C100.C1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] str = s.split(" ");
        int a= Integer.parseInt(str[0]);
        int b= Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        int sum= a+b+c;
        float average= (float) sum/3;

        System.out.println(sum);
        System.out.printf("%.1f",average);
    }
}

