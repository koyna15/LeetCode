
import java.util.HashMap;

public class Ques82 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode res = deleteDuplicates(head);
        display(res);

    }
    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            int v = temp.val;
            freq.put(v, freq.getOrDefault(v,0)+1);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        temp = head;

        while(temp != null){
            if(freq.get(temp.val) == 1){
                tail.next = new ListNode(temp.val);
                tail = tail.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val);
            if(temp.next != null) System.out.print("->");
            temp=temp.next;
        }
    }
}
