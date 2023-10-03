public class LinkedList {
    Node head = null;  //so head will be null in default when a new LinkedList is created by default.
    //so head = null means an empty linked list



    public void insertLast(int data) {

        Node newNode = new Node();
        newNode.setNext(null);


        if(head == null){ //if there are no nodes yet, we are putting our node as head
            head = newNode;
            head.next = null;
        }
        else{ //if it's not the first node we are inserting, then it has to travel until it's the last node then be added to the end

            Node n = head;

            while(n.next != null){
                n = n.next;
            }
            n.next = newNode;
        }


        newNode.setData(data);
        newNode.next = null;

    }





    public void printTheList(LinkedList aLinkedList){
        Node headCopy = aLinkedList.head;
        while(headCopy != null){
            System.out.print(headCopy.getData() + " ");
            headCopy = headCopy.next;
        }
    }
}
