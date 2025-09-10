package LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertData(4);
        linkedList.insertData(5);
        linkedList.insertData(2);
        linkedList.insertData(7);
        linkedList.insertData(4);
        linkedList.insertData(9);

        linkedList.displayData();
        linkedList.deleteNode(2);
    }
}
