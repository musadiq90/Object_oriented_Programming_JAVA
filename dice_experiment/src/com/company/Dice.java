package com.company;

/**
 * musadiq hussain 12979
 * dice class have three variables
 */

public class Dice {
    int total;
    int value1;
    int value2;

    /**
     * constructor is default adn it set the value of total to 0.
     */
    public Dice() {
        total = 0;
    }

    /**
     * roll() is a void return datatype.
     * it have two objects that call different methods
     */
    public void roll() {
        Die die1 = new Die();
        die1.Roll();
        value1 = die1.readResult();

        Die die2 = new Die();
        die1.Roll();
        value2 = die2.readResult();
        total = value1 + value2;
    }

    /**
     * this method just return the value of prevois metod
     * @return total
     */
    public int readResult() {
        return total;
    }

    public boolean pair() {
        if (value1 == value2) {
            return true;
        } else {
            return false;
        }
    }

    boolean duces() {
        if (value1 == value2 && value1 == 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean seven() {
        if (total == 7) {
            return true;
        } else
            return false;

    }
}
