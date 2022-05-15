package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!isEmpty() && in > getNumber())
            totalRejected++;
        else
            super.countIn(in);
    }
}

// ctrl + <- oraz ctrl + -> przełączają się pomiędzy otwartymi wyżej plikami
