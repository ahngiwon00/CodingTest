package CodeUp.C100;



import java.util.Scanner;

public class C1093 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[23];

        for(int i=0; i<n; i++)
            arr[sc.nextInt()-1]++;
        for (int x : arr)
            System.out.print(x+" ");
    }

}