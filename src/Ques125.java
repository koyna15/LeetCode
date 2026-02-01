public class Ques125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String s) {

        String replaced  = s.replaceAll("[^a-zA-Z0-9]","");
        replaced = replaced.toLowerCase();

        int i = 0, j = replaced.length() - 1;
        while(i < j){
            if(replaced.charAt(i) != replaced.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
