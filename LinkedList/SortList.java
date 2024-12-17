//https://leetcode.com/problems/sort-list/description/?envType=problem-list-v2&envId=linked-list

package LinkedList;

public class SortList {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);    
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null){
            prev.next = null;
        }

        return slow;
    }

    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(left != null && right != null){
            if(left.val <= right.val){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        if(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        if(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}
