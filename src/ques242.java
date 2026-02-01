import java.util.Arrays;

public class ques242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
    public static boolean isAnagram1(String s, String t) { //complexity - o(n log n)
        if(s.length() != t.length()) return false;

        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] c = s.toCharArray();
        char[] d = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        for (int i = 0; i < c.length - 1; i++) {
            if(c[i] != d[i]) return false;
        }
        return true;
    }
    public static boolean isAnagram(String s, String t) { //complexity - o(n)
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int x : freq){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
}
