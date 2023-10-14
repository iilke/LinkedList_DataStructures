public class Stack <T>{
    Node first;


    public void push(T data) {
        Node oldFirst = first;
        first = new Node();
        first.setData(data);
        first.next = oldFirst;
    }

    public void pop(){
        Node erase = first;//for memory
        first = first.next;
        erase.next = null;
    }


    public boolean isEmpty(){
        return first==null;
    }

    public void peek(){
        first.getData();
    }

    public void printStack(){ //new challenge: do this by traversing stack only once
        Node w;//stands for walk
        w = first;

        if(first != null){
            while(w != null){
                System.out.print(w.getData() + " ");
                w = w.next;
            }
        }
        else{
            System.out.println("This stack is empty.");
        }
    }




}
