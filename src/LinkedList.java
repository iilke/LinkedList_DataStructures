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
            n.next = newNode;  //we are creating a node at the end of the list
        }


        newNode.setData(data);
        newNode.next = null;

    }



    public void deleteByIndex(int index){

        if(index == 0){//if the first object is being deleted
            if(head != null){//if there is at least one object
                Node headCopy = head;
                head = headCopy.next;
            }
            else{ //if it's an empty list
                System.out.println("List is empty.");
            }
        }

        Node previous = null;
        Node current = head;

        for(int i=0 ; i<index ; i++){
            if(current == null){
                System.out.println("There is no such an index.");
                return;
            }

            previous = current;
            current = current.next;
        }

        current = current.next; //to delete the requested index from user
        //not sure why other resources say it's "previous.next = current.nex"
    }




    public void deleteByData(int data){

    }







    public void printTheList(LinkedList aLinkedList){
        Node headCopy = aLinkedList.head;
        while(headCopy != null){
            System.out.print(headCopy.getData() + " ");
            headCopy = headCopy.next;
        }
    }
}
