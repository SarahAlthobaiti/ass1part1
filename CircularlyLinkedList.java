//Student Name: Sarah Mohammed Althobiti  Student ID: 444004881
public class CircularlyLinkedList<E>{
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(){}
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    }
    private Node<E> tail = null;
    private int size = 0 ;
    public CircularlyLinkedList(){}
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public E first(){
        if(isEmpty()){
            return null;
        }
        return tail.getNext().getElement();
    }
    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    public void rotate(){
        if(tail != null){
            tail = tail.getNext();
        }
    }
    public void traversal(){
        Node<E> c = tail.getNext();
        if (tail != null){
            do{
                System.out.print(c.getElement()+ " ");
                c = c.getNext();
              
            }while(c != tail.getNext());
        }
        System.out.println();
    }
    public void addFirst(E e){
        if(isEmpty()){
            tail = new Node<E>(e,null);
            tail.setNext(tail);
        }else{
            Node<E> newest = new Node<>(e,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void addLast(E e){
        addFirst(e);
        tail = tail.getNext();
    }
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        Node<E> head = tail.getNext();
        if(head == tail){
            tail = null;
        }else{
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }
    public String cheakList(CircularlyLinkedList<E> M){
          
        Node c1=this.tail;
        Node c2 = M.tail;
       
        while (c1.getElement()!=c2.getElement()){
            c2=c2.getNext();
        }
        M.tail = c2;
        c1=c1.getNext();
        c2=c2.getNext();
        
        while(c1.getElement()!=tail.getElement() && c2.getElement()!= tail.getElement()){
            
            if(c1.getNext().getElement()==c2.getNext().getElement()){
                c1=c1.getNext();
                c2= c2.getNext();
            }else{
               
                return "not seq";
            }
            
            
        }
        return "it's seq";       
   }
   public boolean spilt(){
    if(isEmpty()){
        return false;
    }
    else if(size % 2 != 0){
        return false;
    }else{
        CircularlyLinkedList<E> m = new CircularlyLinkedList();
        Node<E> c = tail.next;
        int cheak = size / 2;
        for(int i = cheak; i > 0; i--){
            m.addLast(c.getElement());
            removeFirst();
            c = c.getNext();
        }
        m.traversal();
        traversal();
      }
      return true;

    }
    public void printReverse(){
        if(isEmpty()){
            System.out.println("the list is empty");
        }else{
            Node<E> head = tail.getNext();
            Node<E> c = tail.getNext();
            while(tail != head){
                if(c.getNext() == tail){
                    System.out.print(tail.getElement()+" ");
                    tail = c;
                }
                c = c.getNext();
            }
            System.out.print(head.getElement());
            System.out.println();
        }

    }

}