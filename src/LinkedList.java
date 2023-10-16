public class LinkedList <T> {
    Node head = null;  //so head will be null in default when a new LinkedList is created by default.
    //so head = null means an empty linked list
    private T data;


    public void insertLast(T data) {

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



    public boolean deleteByIndex(int index){
        if(index == 0){ //in cases that head is being deleted
            head = head.next;
            return true;
        }

        Node previous = null;
        Node current = head; //starting from head

            for (int i = 0; i < index; i++) {
                if(current.next != null){
                    previous = current;
                    current = current.next;
                }
                else{
                    return false;
                }
            }

            previous.next = current.next;
            current = null;
            return true;
    }



    public void deleteByData(T data){ //taking data itself as a parameter, deleting it, giving feedback to user at what index it was
        Node travelingHead = head;


        while(travelingHead != null){
            if(travelingHead.getData() == (data)){


                return;
            }

            travelingHead = travelingHead.next;
        }


        //this area is a prototype rn, not finished



        System.out.println(data + " is succesfully deleted from the list. It's index was ");
    }







    public void printTheList(LinkedList aLinkedList){
        Node headCopy = aLinkedList.head;
        while(headCopy != null){
            System.out.print(headCopy.getData() + " ");
            headCopy = headCopy.next;
        }
    }


    public void swapFirstSecond(){ //for swapping first node and second node, but not data itself
        //i solved this problem visually by drawing it, so it probably does not make sense reading the code

        Node <T> oldHead = head;
        head = head.next;
        oldHead.next = head.next;
        head.next = oldHead;
    }


    public void duplicate(int i){ //takes an integer i and creates a copy of the ith node after itself in the lis
        Node <T> newNode = new Node<>();
        Node <T> w = head;
        int index = 0;

        while(w != null){
            if(index == i){
                Node <T> f = w.next;
                w.next = newNode;
                newNode.next = f;

                newNode.setData(w.getData());
                break;
            }
            index++;
            w = w.next;
        }
    }


    public void reverse(){ //study more, rewrite ilke
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }



}
