public class Stack{
    Node first;
    String s;



    public void push(int data) {
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


}
