package com.company;
import java.util.*;

/**
 * this calss has two variable of int and an int aray.
 * it have 6 othres methods too.
 */
public class DiceExperiment {
    static int rolls;
    int[] arr;


    public DiceExperiment(int num) {
        this.rolls = num;
        arr = new int[13];

    }
    void stimulation(){
        Dice obj1 = new Dice();
        for (int i=1; i<=rolls;i++){
            obj1.roll();
            arr[obj1.readResult()] +=1;
        }
    }
    double percent(int a){
        int sum=0;
        double per100;
        for (int i=2; i<arr.length; i++){
            sum+=arr[i];

        }
        per100 = arr[a]*100.0/sum;
        return per100;
    }
    int[] getArr(){
        return arr;
    }
    double[] getresult(){
        double[] result = new double[13];
            for (int i=2; i<result.length; i++){
                result[i] = percent(i);
        }
        return result;
    }

}
