class Solution{
    void move(int[]arr){
        int j = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
public class Negative{
    public static void main(String[]args){
        Solution s = new Solution();
        int[] arr = {-1,2,3,4,5,-2,-3};
        s.move(arr);
        for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
}