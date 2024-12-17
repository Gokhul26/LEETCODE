
//https://leetcode.com/problems/reorder-list/

package LinkedList;

public class reorder {
    public void reorderList(ListNode head) {
        ListNode headFirst = head;
        ListNode mid = middleNode(head);
        ListNode headSec = reverseList(mid);

        if(head == null || head.next == null){
            return;
        }
        while(headFirst != null && headSec != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSec;
            headFirst = temp;

            temp = headSec.next;
            headSec.next = headFirst;
            headSec = temp;
        }

        if(headFirst != null){
            headFirst.next = null;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        if ( head == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }

        return prev;
    }
}
