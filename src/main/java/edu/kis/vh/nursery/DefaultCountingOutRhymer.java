package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_LENGHT = 12;
    public static final int ARRAY_EMPTY_VALUE = -1;
    private final int[] numbers = new int[MAX_LENGHT];


    public int total = ARRAY_EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == ARRAY_EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int getNumber() {
        if (isEmpty())
            return ARRAY_EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return ARRAY_EMPTY_VALUE;
        return numbers[total--];
    }

}
