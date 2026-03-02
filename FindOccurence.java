public class FindOccurence {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,2,5};
        int target = 2;
        int firstindex = 0;
        int lastindex = 1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                if(firstindex==0){
                firstindex = i;
                }else
                lastindex = i;
            }
        }
        System.out.println("First"+firstindex+" "+lastindex);
    }
}