package com.leonslegion.casino.CardGamePackage;

/**
 * Created by cameronsima on 5/9/17.
 */
public class BlackjackHand extends Hand implements Comparable {

    private int evaluateHand(Hand hand) {

        int sum = 0;
        for (Card card : hand.getHand()) {
            sum += card.getPointValue();
        }
        return sum;
    }

    public int evaluateHand() {
        int sum = 0;
        for (Card card: this.getHand()) {
            sum += card.getPointValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Object otherHand) {

        int thisTally = evaluateHand(this);
        int otherTally = evaluateHand((Hand) otherHand);

        if (thisTally > 21 && otherTally > 21) {
            return 0;
        }else if (thisTally > 21) {
            return 1;
        } else if (otherTally > 21) {
            return -1;
        } else if (thisTally > otherTally) {
            return -1;
        } else if (thisTally < otherTally) {
            return 1;
        }
        return 0;
    }
}