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
        //linkedList.deleteNode(2);
        //deleteDuplicateNoBuffer(linkedList);
        partitionK(linkedList, 5);
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

    public static void deleteDuplicateNoBuffer(LinkedList linkedList) {
        Node current = linkedList.head;


        while(current != null) {
            Node runner = current;
            while(runner.next != null) {
                if(current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        System.out.println("After deleting: ");
        linkedList.displayData();
    }

    public static void partitionK (LinkedList linkedList, int k) {
        System.out.println("Partitioned: ");
        LinkedList partitioned = new LinkedList();
        Node current = linkedList.head;
        while(current.next != null) {
            if(current.data < k) {
                partitioned.insertData(current.data);
            }
            current = current.next;
        }
        current = linkedList.head;
        while(current != null) {
            if(current.data >= k) {
                partitioned.insertData(current.data);
            }
            current = current.next;
        }
        partitioned.displayData();
    }

}
