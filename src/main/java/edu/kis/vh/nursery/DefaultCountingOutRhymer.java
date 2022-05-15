package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int INT1 = -1;
    private final int[] numbers = new int[INT];


    public int total = INT1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == INT1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int getNumber() {
        if (isEmpty())
            return INT1;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return INT1;
        return numbers[total--];
    }

}
