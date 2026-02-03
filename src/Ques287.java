import java.util.Arrays;
import java.util.HashSet;

public class Ques287 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        //findDuplicate1(arr);
        System.out.println(findDuplicate(arr));

        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
    //BruteForce
    public static void findDuplicate1(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
    //Using HashSet
    public static int findDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            if(set.contains(x)){
                return x;
            }
            set.add(x);
        }
        return -1;
    }
}
