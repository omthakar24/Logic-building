public class Armmstrong {
    static boolean isArms(int num){
        int k = String.valueOf(num).length();
        int sum =0;
        int temp = num;
        while(num>0){
            int digit = num %10;
            sum += Math.pow(digit,k);
            num = num/10;
        }
            if(temp == sum){
                return true;
            }return false;
 }
    public static void main(String[] args) {
        int num =153;
        System.out.println(isArms(num));
    }
}
