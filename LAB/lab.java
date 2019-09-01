package com.LAB;

import java.io.Console;
import java.io.IOException;

    public class SlotMachine {
        Dial[] dials = new Dial[3];
        int credit;


        public int getbet() {
            Console a = System.console();
            if (a == null)
            {
                System.out.println("no Console.");
                System.exit(1);
            }
            String stringBet = a.readLine("please enter a bet amount (or a negative amount to quit):");
            int intBet = Integer.parseInt(stringbet);
            return intBet;
        }
        public void pullLever() {
            for (int i=1; i<=3; i++)
        }

        public String readSlot(){

        }
        public int computeWinnings() {

        }

        public static void main(String[] args) throws IOException {
            SlotMachine mySlot = new SlotMachine();
            int bet;
            System.out.println("welcome to the Slot Machine!!! \n you have "+mySlot.credit + " credit.\n ");
            bet = mySlot.getbet();
            while (bet>0)
            {
                if(bet>mySlot.credit)
                    bet = mySlot.credit;
            }
        }
    }
