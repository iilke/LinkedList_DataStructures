//İlke, 03.10.2023 started
//add these next time: insertFirst, deleteByIndex, deleteByData
//extra: remake the list backwards

import java.util.Scanner;

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
        myLinkedList.insertLast(4);

        myLinkedList.printTheList(myLinkedList);

        System.out.println();

        //******************************************************************************************************
        System.out.println("Deleting by index: Print the index that you want to delete data from (index starts from 0) : ");
        Scanner sc = new Scanner(System.in);
        int  index = sc.nextInt();

        if(myLinkedList.deleteByIndex(index) == true){
            System.out.println("Index " + index + " is succesfully deleted from the list.");
        }
        else{
            System.out.println("Deletion unsuccesful.");
        }


        myLinkedList.printTheList(myLinkedList);


    }
}
