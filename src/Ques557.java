public class Ques557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String res = reverseWords(s);
        System.out.println(res);
    }
    public static String reverseWords(String s) {

        char[] ch = s.toCharArray();
        int start = 0;
        for (int i = 0; i <= ch.length -1; i++) {
            if (ch[i] == ' ') {
                reverse(ch, start, i - 1);
                start = i + 1;
            }
        } reverse(ch, start, ch.length - 1);
        return new String(ch);
    }
    public static void reverse(char[] ch, int i, int j){

        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
