public class Ques83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode res = link(head);
        display(res);
    }
    public static ListNode link(ListNode head){
        ListNode temp =head;
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val ){
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val );
            if(temp.next != null) System.out.print("->");
            temp=temp.next;
        }
    }
}
