//İlke, 03.10.2023 started
//add these next time: insertFirst, deleteByIndex, deleteByData
//extra: remake the list backwards

import java.sql.SQLOutput;
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

        LinkedList<Integer> myLinkedList = new LinkedList();
        myLinkedList.insertLast(1);
        myLinkedList.insertLast(2);
        myLinkedList.insertLast(3);
        myLinkedList.insertLast(4);

        myLinkedList.printTheList(myLinkedList);

        System.out.println();

        System.out.println("Swapping first node and second node: ");
        myLinkedList.swapFirstSecond();
        myLinkedList.printTheList(myLinkedList);

        System.out.println("Duplicating 2nd variable (which is 3): ");
        myLinkedList.duplicate(2);
        myLinkedList.printTheList(myLinkedList);

        //************************************* Reversing linkedlist *****************************************************************
        System.out.println("\n");
        System.out.println("REVERSING LINKEDLIST:");

        LinkedList<Integer> toBeReversedLL = new LinkedList<>();
        toBeReversedLL.insertLast(1);
        toBeReversedLL.insertLast(2);
        toBeReversedLL.insertLast(3);
        toBeReversedLL.insertLast(4);


        toBeReversedLL.printTheList(toBeReversedLL);
        System.out.println();
        System.out.println("Reversed:");

        toBeReversedLL.reverse();


        toBeReversedLL.printTheList(toBeReversedLL);




        System.out.println();
        //************************************* Deleting from linkedlist *****************************************************************
        /*System.out.println("Deleting by index: Print the index that you want to delete data from (index starts from 0) : ");
        Scanner sc = new Scanner(System.in);
        int  index = sc.nextInt();

        if(myLinkedList.deleteByIndex(index) == true){
            System.out.println("Index " + index + " is succesfully deleted from the list.");
        }
        else{
            System.out.println("Deletion unsuccesful.");
        }


        myLinkedList.printTheList(myLinkedList);*/



        //************************************************** STACKS **********************************************************************************
        System.out.println();
        System.out.println("-Stacks-\n");

        Stack<String> linkedListStack = new Stack<>();


        linkedListStack.push("a");
        linkedListStack.push("b");
        linkedListStack.push("c");
        linkedListStack.push("d");

        linkedListStack.pop(); //removes d


        linkedListStack.printStack();


        //************************************************** QUEUES **********************************************************************************
        System.out.println();
        System.out.println("-QUEUES-\n");

        Queue<Double> queueLinkedList = new Queue<>();

        queueLinkedList.add(1.0);
        queueLinkedList.add(1.1);
        queueLinkedList.add(1.2);
        queueLinkedList.add(1.3);

        queueLinkedList.printQueue();

        queueLinkedList.remove();
        System.out.println("Dequeued: ");
        queueLinkedList.printQueue();

        System.out.println("peek:");
        queueLinkedList.peek();


    }
}
