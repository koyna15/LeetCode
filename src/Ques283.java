import java.util.Arrays;

public class Ques283 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void pushZerosToEnd(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[k++] = arr[i];
            }
        }
        while(k < arr.length){
            arr[k++] = 0;
        }
    }
}
