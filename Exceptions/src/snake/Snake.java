package snake;
public class Snake implements Cloneable {
    private Snake next;
    private char c;
    // Value of i == number of segments
    Snake(int i, char x) {
        c = x;
        if(--i > 0)
            next = new Snake(i, (char)(c +1));
    }
    void increment() {
        c++;
        if(next != null)
            next.increment();
    }
    public String toString() {
        String s = ":" + c;
        if(next != null)
            s += next.toString();
        return s;
    }


    public Object clone(){

        try {
            Snake ClonedSnake = (Snake) super.clone();
            if (next !=null){
                ClonedSnake.next = (Snake) next.clone();
            }
            return ClonedSnake;
        }
        catch (CloneNotSupportedException e) {
            return null;

        }

    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Snake s = new Snake(5, 'a');
        System.out.println("s = " + s);
        Object s2 = s.clone();

        System.out.println("s2 = " + s2);
        s.increment();
        System.out.println("after s.increment, s2 = " + s2);
    }
}
