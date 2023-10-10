
public class CustLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static CustLinkedList insert(CustLinkedList list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printList(CustLinkedList list) {
        Node currentNode = list.head;
        System.out.println("Linkedlist conatins below element");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

    }

    public static void main(String[] args) {
        CustLinkedList list = new CustLinkedList();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        printList(list);

    }

}
