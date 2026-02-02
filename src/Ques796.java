public class Ques796 {
    public static void main(String[] args) {
        String s = "abcde", goal = "abced";
        boolean ans = rotateString(s, goal);
        System.out.println(ans);
    }
    public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()) return false;

        return (s+s).contains(goal);
    }
}
