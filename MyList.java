package Laboratorka2;
import java.lang.Iterable;
import java.util.Iterator;
//import java.util.function.Consumer;

public class MyList<E> implements Iterable <E>{
    private Node<E> head;
    private Node<E> tail;
    private int length;

    public MyList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }


    public void insertLast(E value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        newNode.setPrevious(tail);
        tail = newNode;
        length++;
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getItem() + " ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if (tail == null) {
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp + " ");
            temp = temp.getPrevious();
        }
        System.out.println("null");
    }

    public E get(final int index){
        if (!(index >= 0 && index < length)) {
            System.out.print("OutOfRange");
        }
        Node<E> x = head;
        for (int i = 0; i < index; i++) {
            x = x.getNext();
        }
        return x.getItem();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator(this);
    }


}
