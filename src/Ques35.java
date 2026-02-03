public class Ques35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int ans = searchInsert(arr, 7);
        System.out.println(ans);

    }
    static int searchInsert(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
