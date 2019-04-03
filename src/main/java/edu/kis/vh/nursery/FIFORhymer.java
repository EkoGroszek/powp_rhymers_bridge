package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {


    private IntLinkedList temp = new IntLinkedList();

    //Odp: Najlepszy wybór to implementacja listy, ponieważ jest ona bardziej ealastyczna niż stos


    @Override public int countOut() {
        while (!callCheck())

            getTemp().countIn(super.countOut());

        int ret = getTemp().countOut();

        while (!getTemp().callCheck())

            countIn(getTemp().countOut());

        return ret;
    }

    public IntLinkedList getTemp() {
        return temp;
    }

}
