package Laboratorka2;

import java.util.function.Consumer;
import java.util.LinkedList;

public class Task1 {
    public static<E> void ForEach(final Iterable<E> iterable) {
        for(E item:iterable){
            System.out.print(item + " ");
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        MyList dll = new MyList();
        dll.insertLast(2);
        dll.insertLast(10);
        dll.insertLast(20);
        dll.insertLast(50);

        dll.displayForward();
        MyList list = new MyList();
        ForEach(dll);



        //System.out.println(dll.length());
    }
}

