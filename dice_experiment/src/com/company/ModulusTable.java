package com.company;

/**
 * musadiq hussain 12979
 * modulusTable.java will create a table of an integer, given by a user through scanner method.
 * initially 2 private variables are declared.
 */
public class ModulusTable {
    private int n;
    private int size = 12;

    /**
     * here is parametrized constructor that takes 2 values.
     * @param n
     * @param size
     */
    public ModulusTable(int n, int size) {
        this.n = n;
        this.size = size;
    }

    /**
     * string method that create and store the modulus values in a string.
     * @return str
     */
    public String toString(){
        String str=""; //[0][0]=""
        for(int i=0; i<=size;i++){
            for(int j=0; j<=size;j++){
               if (i==0)
                    str+=j;
                else if (j==0)
                    str+=i;
                else
                    str+=(i*j%n);

                if(j==0&&i>=10||i==0&&j>=10)
                    str+="  ";
                else
                    str+="   ";
            }
            str+="\n";
        }
        return str;
    }
    }

