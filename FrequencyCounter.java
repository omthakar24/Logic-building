import java.util.HashMap;
import java.util.Map;
public class FrequencyCounter {
    public static void main(String[]args){
    HashMap<Integer,Integer> hash = new HashMap<>();
    int[] arr = {1,2,3,4,5,1,2,3,4};
    for (int i : arr) {
        hash.put(i,hash.getOrDefault(i,0)+1);
    }
    for(Map.Entry<Integer,Integer>entry: hash.entrySet()){
        if(entry.getValue()==1){
            System.out.println(entry.getKey());
        }
    }
    }
}
