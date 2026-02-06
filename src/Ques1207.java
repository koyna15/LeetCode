import java.util.HashMap;
import java.util.HashSet;

public class Ques1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        boolean ans = uniqueOccurrences(arr);
        System.out.println(ans);
    }
    static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int freq : map.values()) {
            if(!set.add(freq)) //set.add(freq) == false (can also write this)
                //If this frequency already exists in the set, then return false.
            {
                return false;
            }
        }
        return true;
    }
}
