public class Node {
    public int data;
    public Node next;

    public Node(){}
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public int getData(){return data;}
    public Node getNext(){return next;}
    public void setData(int data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
}
