package Simple;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicates {

    static void removeDuplicates(Node head) {
        Node current = head;

        // Outer loop traverses the list
        while (current != null && current.next != null) {
            Node runner = current;

            // Inner loop checks for duplicates of `current`
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    // Remove duplicate node
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }

    // Helper method to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(10);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(20);

        System.out.println("Original list:");
        printList(head);

        removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}

