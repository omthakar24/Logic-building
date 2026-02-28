public class Divisors{
    public static void main(String[]args){
        int num = 12;
        for(int i =1;i*i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                if(i!=num/i){
                    System.out.print(num/i+" ");
                }
            }
        }
    }
}