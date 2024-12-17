//https://leetcode.com/problems/palindrome-linked-list/description/?envType=problem-list-v2&envId=linked-list
// ouput not yet came
package LinkedList;

public class palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverse(mid);
        ListNode reReverseSecond = headSecond;

        while(head!= null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverse(reReverseSecond);
        if(head == null || headSecond == null){
            return true;
        }else{
            return false;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while(current != null){
            current.next = prev;    
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
