//https://leetcode.com/problems/reverse-linked-list-ii/

package LinkedList;

public class reverseII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode current = head;

        if(left == right){
            return head;
        }
        //move towards left - 1 position
        for (int i = 0;current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next!= null){
                next = next.next;
            }}

            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = current;
            return head;
        }
}
