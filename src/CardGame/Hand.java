package CardGame;

import java.util.Arrays;

public class Hand {

    private int size; //will be 4 for this game
    private Card[] cards;
    private int numberOfCards = 0;  //will be incremented as cards are added to hand

    public Hand(int s) {
        size = s;
        cards = new Card[size];
    }

    public void addCard(Card c) {
        cards[0] = new Card(4, "Hearts");
        cards[1] = new Card(4, "Clubs");
        cards[2] = new Card(4, "Spades");
        cards[3] = new Card(4, "Clubs");
        numberOfCards++;
    }

    public boolean isASequence() {
        // checks for a sequence
        Arrays.sort(cards);
        boolean isSequence;
        int card1 = Integer.parseInt(String.valueOf(String.valueOf(cards[0]).charAt(0)));
        int card2 = Integer.parseInt(String.valueOf(String.valueOf(cards[1]).charAt(0)));
        int card3 = Integer.parseInt(String.valueOf(String.valueOf(cards[2]).charAt(0)));
        int card4 = Integer.parseInt(String.valueOf(String.valueOf(cards[3]).charAt(0)));
        if (card4 == card3 + 1 && card3 == card2 + 1 && card2 == card1 + 1 && card1 == card2 - 1) {
            return isSequence = true;
        } else {
            return isSequence = false;
        }
    }

    public boolean hasThreeOfAFaceValue() {
        //checks for three of a face value
        boolean threeFaceValue;
        int card1 = Integer.parseInt(String.valueOf(cards[0]).charAt(0));
        int card2 = Integer.parseInt(String.valueOf(cards[1]).charAt(0));
        int card3 = Integer.parseInt(String.valueOf(cards[2]).charAt(0));
        int card4 = Integer.parseInt(String.valueOf(cards[3]).charAt(0));

        if ((card1 == card2) && (card2 == card3) && (card3 == card4)) {
            return threeFaceValue = true;
        } else {
            return threeFaceValue = false;
        }
    }

    public String toString() {
        return "Your hand is: " +cards.toString() + "Cards are all of face value" + hasThreeOfAFaceValue() + "\nCards are all in a sequence" + isASequence();
    }
}
