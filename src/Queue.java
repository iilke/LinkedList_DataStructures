/*
・Maintain one pointer first to first node in a singly-linked list.
・Maintain another pointer last to last node.
・Dequeue from first.
・Enqueue after last.
*/

public class Queue <T>{

    Node <T> first ;

    public boolean isEmpty(){
        return (first==null);
    }


    //STUDY THIS PART AGAIN!!
    public void add(T data){ //adding to last
        Node <T> newNode = new Node<>(data,null);
        if(first == null){//if list is empty
            first = newNode;
        }
        else{
            Node <T> walk = first;

            while(walk.getNext() != null){
                walk = walk.getNext();
            }

            walk.setNext(newNode);
        }

    }


    public void remove(){ //removing from first
        if(first==null){
            System.out.println("Queue is empty already.");
        }
        else {
            first = first.next;
        }
    }


    public void peek(){
        if(first != null){
            System.out.println(first.getData());
        }
        else{
            System.out.println("List is empty.");
        }
    }



    public void printQueue(){
        if(isEmpty()){
            System.out.println("This queue is empty.");
        }
        else{
            Node w = first;
            while(w!=null){
                System.out.println(w.getData());
                w = w.next;
            }
        }
    }



}
