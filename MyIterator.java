package Laboratorka2;

import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {
        private int index = 0;
        private MyList<E> mylist;

    public MyIterator( MyList<E> mylist) {
        this.mylist = mylist;
    }

    @Override
    public boolean hasNext() {
        return index < mylist.length();
    }

    @Override
    public E next() {
        return mylist.get(index++);
    }
}
