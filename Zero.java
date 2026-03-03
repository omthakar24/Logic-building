import java.util.ArrayList;
public class Zero {
    static void movezero(int[]arr){
        int count = 0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }else{
                arr1.add(arr[i]);
            }
        } 
        while(count-->0){
            arr1.add(0);
        }
        for(int i=0;i<arr1.size();i++){
            System.out.print(" "+arr1.get(i));
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,0,4,5,6};
        movezero(arr);
    }
}
