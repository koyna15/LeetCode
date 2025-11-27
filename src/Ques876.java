

public class Ques876 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(middle(head));
    }
    //Brute Force Technique
    public static int middle(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp=temp.next;
            count = count+1;
        }
        int mid = count / 2;
        ListNode temp2 = head;
        for(int i=0;i<mid;i++ ){
            temp2 = temp2.next;
        }
        return temp2.val;

    }

    //Using Tortoise and Hare Algo...
    public static int middle2(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
