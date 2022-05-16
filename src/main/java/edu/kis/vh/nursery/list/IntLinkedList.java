package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca stukturę Linked List przechowująca wartości całkowite typu int
 */
public class IntLinkedList {

    public static final int LIST_EMPTY_VALUE = -1;
    private Node last;

    /**
     * Dodaje na koniec listy node
     * @param i wartość przechowywana w nowym nodzie
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * @return true jeżeli lista pusta, inaczej false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return true jeżeli lista pełna, inaczej true
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return wartość na ostatniej pozycji w liście
     */
    public int top() {
        if (isEmpty())
            return LIST_EMPTY_VALUE;

        return last.value;
    }

    /**
     * Usuwa ostatni node z listy
     * @return wartość na ostatniej pozycji w liście
     */
    public int pop() {
        if (isEmpty())
            return LIST_EMPTY_VALUE;

        int ret = last.value;
        last = last.prev;

        return ret;
    }

    /**
     * @return ostatni node
     */
    public Node getLast() {
        return last;
    }
}
