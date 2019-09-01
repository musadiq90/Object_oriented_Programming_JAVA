package Threading;
class Coffee1 extends Thread {
    Coffee1(String name) {
        super(name);
    }
    public void run() {
        for(int n = 1; n <= 3; n++) {
            System.out.println("I like coffee");
            try {
                sleep(1000);  // 1 second
            }
            catch(InterruptedException e) {}
            System.out.println(this.getName());
        }
    }
}
class Tea1 extends Thread {
    Tea1(String name) {
        super(name);
    }
    public void run() {
        for(int n = 1; n <= 5; n++) {
            System.out.println("I like tea");
            System.out.println(getName());
        }
    }
}
public class Drinks2 {
    public static void main(String args[]) {

        System.out.println("I am main");
        Coffee t1 = new Coffee("Wawa Coffee");
        Tea t2 = new Tea("China Tea");

        t1.start();
        t2.start();
        System.out.println("Main is done");
    }
}

