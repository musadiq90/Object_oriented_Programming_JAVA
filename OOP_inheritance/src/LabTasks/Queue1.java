package LabTasks;

public class Queue1 {

    private char[] q;
    private int putloc= -1;

    public Queue1(){
        q = new char[10];
    }

    Queue1(Queue1 que)
    {
        q = que.q;
        putloc = que.putloc;
    }

    Queue1 (char[] arr){
        q = arr;
        putloc = arr.length-1;
    }

    public Queue1(int a){
        q = new char[a];
    }
    public void put(char c){
        if (isFull()){
            System.out.println("queue is full");
        }
        else{
            putloc++;
            q[putloc] = c;
        }
    }

    public boolean isFull(){
        if(putloc == q.length-1)
            return true;
        else return false;
    }

    public void get(){
        if(putloc==-1){
            System.out.println("queue is empty");
        }
        else {
            System.out.println(q[putloc]);
        }
    }

}
