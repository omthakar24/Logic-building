import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i = 0; i<n;i++){
            arr[i]=1;
        }
        for(int i = 2;i*i<=n;i++){
            if(arr[i]==1){
            for(int j = i*i;j<=n;j+=i){
                arr[j]=0;
        }
    }
        for(int k = 0;k<n;k++){
            if(arr[k] ==1){
        System.out.println(k);
            }
        }
    }
}
}