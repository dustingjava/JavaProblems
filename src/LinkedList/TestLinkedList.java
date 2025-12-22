package LinkedList;

import java.util.HashSet;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertData(4);
        linkedList.insertData(5);
        linkedList.insertData(2);
        linkedList.insertData(5);
        linkedList.insertData(4);
        linkedList.insertData(9);

        linkedList.displayData();
        linkedList.deleteNode(2);
        deleteDuplicate(linkedList);
    }

    public static void deleteDuplicate(LinkedList linkedList){
        HashSet<Integer> set = new HashSet<>();
        Node previous = linkedList.head;
        set.add(linkedList.head.data);
        Node current = linkedList.head.next;
        LinkedList linkedlistNew = new LinkedList();
        linkedlistNew.insertData(previous.data);
        while(current != null) {
            if(!set.contains(current.data)){
                linkedlistNew.insertData(current.data);
            }
            set.add(current.data);
            current = current.next;

        }
        System.out.println("Removing duplicates");
        linkedlistNew.displayData();
    }

}
