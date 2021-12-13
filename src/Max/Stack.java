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

    public void push(Integer elem) {
        list.addLast(elem);
        if (list.size() == 1) {
            trackStack.push(elem);
            return;
        }

        if (trackStack.peek() < elem) trackStack.push(elem);
        else trackStack.push(trackStack.peek());
    }

    public int max() {
        return trackStack.peek();
    }

    public Integer pop() {
        if (isEmpty())
            throw new java.util.EmptyStackException();
        trackStack.removeLast();
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
        return -1;
    }

}
