
class Ques19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = removeNthFromEnd(head, 2);
        display(res);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        if(n == count) return head.next;

        int key = count - n;
        ListNode tail = head;
        int i=1;
        while(i<key){
            tail=tail.next;
            i++;
        }
        tail.next = tail.next.next;
        return head;
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