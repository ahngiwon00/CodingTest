package CodeUp.C100.C1026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str= s.split("\\:");
        System.out.println(Integer.parseInt(str[1]));
    }
}

