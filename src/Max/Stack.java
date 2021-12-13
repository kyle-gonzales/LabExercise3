package Max;

public class Stack implements Iterable<Integer>, Comparable<Integer> {

    private java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();   
    private java.util.LinkedList<Integer> trackStack = new java.util.LinkedList<Integer>();

    public Stack() {
    }

    public Stack(Integer elem) {
        push(elem);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(Integer elem) { //modified for maxStack operation
        list.addLast(elem);
        if (list.size() == 1) {
            trackStack.addLast(elem);
            return;
        }

        if (elem > trackStack.peekLast()) trackStack.addLast(elem);
        else trackStack.addLast(trackStack.peekLast());
    }

    public int max() {
        return trackStack.peekLast();
    }

    public Integer pop() {
        if (isEmpty())
            throw new java.util.EmptyStackException();
        int x = trackStack.removeLast(); //garbage variable
        return list.removeLast();

    }

    public Integer peek() {
        return list.peekLast();
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return list.iterator();
    }

    @Override
    public int compareTo(Integer elem) {
        if (trackStack.peek() == elem) return 0;
        else if (trackStack.peek() > elem) return 1;
        return 10000;
    }

}
