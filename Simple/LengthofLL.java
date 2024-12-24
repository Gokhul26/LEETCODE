package Simple;


class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; next = null; }
}

public class LengthofLL {
    static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println("Length of linked list: " + getLength(head));
    }
}
