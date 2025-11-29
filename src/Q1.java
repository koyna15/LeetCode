//package LeetCode;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int start = 0, end = arr.length-1;

        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum == target){
                System.out.println("["+start +", "+end +"]");
                return;
            }
            else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
    }
}


