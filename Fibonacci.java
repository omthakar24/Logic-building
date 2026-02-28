import java.util.Scanner;

public class Fibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fn = 0;
        int sn = 1;
        for(int i = 0;i<=n;i++){
            System.out.print(fn+" ");
            int temp = fn+sn;
            fn = sn;
            sn = temp;
        }
        sc.close();
    }
}