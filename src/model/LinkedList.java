package model;

public class LinkedList<T> {

    private Node <T> head;
    private int size;

    public Node<T> getHead() {
        return head;
    }
    public void setHead(Node<T> head) {
        this.head = head;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public LinkedList(Node<T> head, int size) {
        this.head = null;
        this.size = 0;
    }

    public void appendToTail(T value){
        Node<T> nuevoNodo= new Node<>(value);
        if(head == null){
            head = nuevoNodo;
        }else{
            Node<T> current=head;
            while( current.getNext() !=null){
                current=current.getNext();
            }
            current.setNext(nuevoNodo);
            size++;
        }
    }

    public T findByValue(T value){
        Node<T> current= head;
        while(current != null){
            if(current.getValue().equals(value)){
                return current.getValue();
            }
            current= current.getNext();
        }
        return null;

    }

    public boolean deleteByValue(T value){
        if(head == null){
            return false;
        }

        if (head.getValue().equals(value)){
            head= head.getNext();
            size--;
            return true;
        }
                
        Node<T> current= head;
        while(current.getNext() != null){
            if(current.getNext().getValue().equals(value)){
                current.setNext( current.getNext().getNext());
                size--;
                return true;

            }
            current= current.getNext();
        }
        return false;
    }

    public void print(){
        if (head == null){
            System.out.println("END");
            return;
        }
        Node<T> current= head;
        while(current.getNext()!= null){
            System.out.println(current.getValue()+"->");
            current=current.getNext();
        }
        System.out.println(current.getValue()+"-> END");
    }

    
    
    
}
