package linkedlist;

public class LinkedListReverse {

    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }

    public static ListNode reverse(ListNode head){
        if (head == null){
            return null;
        }
        ListNode cur = head;
        ListNode oldHead = null;
        ListNode newHead = null;
        while(cur!=null){
            oldHead= cur.next;//1第二个结点
            cur.next=newHead;//3第一个结点变成第二个结点之前next变空
            newHead=cur;//4第一个结点由上一步已经变成第二个结点一样，再赋给新的结点
            cur=oldHead;//2第二个结点变成第一个
        }
        return newHead;
    }

    public static void main(String[] args) {
        // 测试
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
        node1.next = node2;
//        node2.next = node3;
        ListNode head = new ListNode(0);
        head = reverse(node1);
        System.out.print(head.data+" "+head.next.data);
//        System.out.print(head.data+" "+head.next.data+" "+head.next.next.data);
    }

}
