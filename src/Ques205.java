import java.util.HashMap;

public class Ques205 {
    public static void main(String[] args) {
        String  s = "egg", t = "add";
        boolean ans = isIsomorphic(s, t);
        System.out.println(ans);
    }
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Character> sT = new HashMap<>();
        HashMap<Character, Character> tS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            char d = t.charAt(i);

            if(sT.containsKey(c)){
                if(sT.get(c) != d){
                    return false;
                }
            }
            else{
                sT.put(c, d);
            }
            if(tS.containsKey(d)){
                if(tS.get(d) != c){
                    return false;
                }
            }
            else{
                tS.put(d, c);
            }
        }
        return true;
    }
}
