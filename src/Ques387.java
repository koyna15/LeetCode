import java.util.HashMap;

public class Ques387 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
    public static int firstUniqChar1(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char target = ch[i];
            boolean unique = true;

            for (int j = 0; j < ch.length; j++) {
                if(i != j && ch[j] == target){
                    unique = false;
                    break;
                }
            }
            if(unique) return i;
        }
        return -1;
    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(int i = 0; i < s.length() ; i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;

    }
}
