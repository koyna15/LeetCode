import java.util.Arrays;

public class Ques34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] answer = searchRange(arr,8);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] searchRange(int[] arr, int target){
        int[] res = {-1,-1};
        res[0] = first(arr, target);
        res[1] = last(arr,target);

        return res;
    }
    static int first(int[] arr, int target){

        int start = 0, end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    static int last(int[] arr, int target){

        int start = 0, end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
