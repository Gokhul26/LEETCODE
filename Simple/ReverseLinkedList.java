package Simple;

class Node {
    int data;
    Node next;
    Node(int data) { 
        this.data = data; next = null; 
    }
}

public class ReverseLinkedList {
    static Node reverse(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println("Original list:");
        printList(head);
        head = reverse(head);
        System.out.println("Reversed list:");
        printList(head);
    }
}
