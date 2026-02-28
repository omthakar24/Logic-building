public class Armstrong{
    static boolean isArm(int num){
        int result = 0;
        int temp =num;
        int count = String.valueOf(num).length();
        while(temp>0){
            int digit = temp %10;
            result += Math.pow(digit,count);
            temp = temp/10;
        }
        return num == result;
    }
    public static void main(String[] args){
        int num = 153;
        System.out.println(isArm(num));
    }
}