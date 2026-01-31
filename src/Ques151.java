public class Ques151 {
    public static void main(String[] args) {
        String s = " the sky is blue  ";
        s = s.trim().replaceAll("\\s+", " ");
        String res = reverseWords(s);
        System.out.println(res);

    }
    public static String reverseWords(String s) {
        char[] ch = s.toCharArray();
        reverse(ch, 0, ch.length - 1);
        int start = 0;

        for (int i = 0; i <= ch.length; i++) {
            if (i == ch.length || ch[i] == ' ') {
                reverse(ch, start, i - 1);
                start = i + 1;
            }
        }
        return new String(ch);
    }
    static void reverse(char[] ch, int i, int j){

        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
