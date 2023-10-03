//İlke, 03.10.2023
//add these next time: insertFirst, deleteAtIndex
//extra: remake the list backwards

public class Main {
    public static void main(String[] args) {
        Node m3 = new Node(3,null);
        Node m2 = new Node(2,m3);
        Node m1 = new Node(1,m2);

        System.out.println("m1: " + m1.getData());
        System.out.println("m1 next:" + m1.getNext().getData());

        //******************************************************************************************************
        System.out.println("Inserting to end by using LinkedList class:");

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insertLast(1);
        myLinkedList.insertLast(2);
        myLinkedList.insertLast(3);

        myLinkedList.printTheList(myLinkedList);


    }
}
