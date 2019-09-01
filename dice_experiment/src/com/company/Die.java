package com.company;


/**
 * musadiq hussain
 * die class have an instance variable, two methods and a constructor
 */
public class Die {
    int value;

    public Die() {
        value = 0;
    }
    public void Roll(){
      value = ((int)Math.random()*6)+1;

    }
    public int readResult(){
        return value;

    }
}
