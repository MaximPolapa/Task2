package Laboratorka2;

public class Node<E> {
    private E item;
    private Node<E> previous;
    private Node<E> next;

    public Node(E item) {
        this.item = item;
        this.previous = previous;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}