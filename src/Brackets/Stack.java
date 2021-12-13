package Brackets;

public class Stack<T> implements Iterable<T> {

    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    public Stack() {
    }

    public Stack(T elem) {
        push(elem);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(T elem) {
        list.addLast(elem);
    }

    public T pop() {
        if (isEmpty())
            throw new java.util.EmptyStackException();

        return list.removeLast();
    }

    public T peek() {
        return list.peekLast();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }

}
