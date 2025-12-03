

public class Ques203 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        ListNode result = removeElements(head,6);
        display(result);
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp =head;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(temp != null){
            if(temp.val != val){
                tail.next = temp;
                tail=tail.next;
            }
            temp=temp.next;
        }
        tail.next = null;
        return dummy.next;
    }
    public static void display(ListNode head){
        ListNode temp= head;
        while(temp != null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
    }

}
