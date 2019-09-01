package Threading;

class Coffee extends Thread {
    Coffee(String name) {
        super(name);
    }

    public void run() {
        for(int n = 1; n <= 3; n++) {
            System.out.println("I like coffee");
            yield();
            System.out.println(this.getName());
            yield();
        }}}

class Tea extends Thread {
    Tea(String name) {
        super(name);
    }
    public void run() {
        for(int n = 1; n <= 3; n++) {
            System.out.println("I like tea");
            yield();
            System.out.println(this.getName());
            yield();
        }
    }
}
public class Drinks {
    public static void main(String args[]) {

        System.out.println("I am main");
        Coffee t1 = new Coffee("Wawa Coffee");
        Tea t2 = new Tea("Sleepy Time Tea");
                t1.start();
                t2.start();
        System.out.println("Main is done");
    }
}




