package LinkedList;

public class LinkedList {
    Node head;
    public void insertData(int d) {
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void displayData() {
        Node current = head;
        while(current != null) {
            System.out.println("-> "+current.data);
            current = current.next;
        }
    }
    public void deleteNode(int d) {
        LinkedList linkelist = new LinkedList();
        Node current = head;
        while(current != null) {
            if(current.data != d) {
                linkelist.insertData(current.data);
            }
            current = current.next;
        }
        System.out.println("After deleting");
        linkelist.displayData();
    }
}
