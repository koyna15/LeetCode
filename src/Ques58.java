public class Ques58 {
    public static void main(String[] args) {
        //String s = "Hello World";
        //String s = "luffy is still joyboy";
        String s = "   fly me   to   the moon  ";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
    public static int lengthOfLastWord(String s) {
        String[] parts = s.split(" ");
        int length = 0;
        for(int i = parts.length - 1; i>=0 ; i--){
            length = parts[i].length();
            break;
        }
        return length;
    }
}
