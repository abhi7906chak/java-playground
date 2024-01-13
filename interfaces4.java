// all interfaces and therad using extends is covered and  
// therad constractor and methos is coverd in this code
// 13/01/2024

class laptop implements tv {
    public void printlaptop() {
        System.out.println("In the laptop class");
    }

    public void sound() {
        System.out.println("tv's sound");
    }

    public void displayon() {
        System.out.println("tv;s display is on");
    }

    public void keys() {
        System.out.println("al; key is working");
    }

    void checkAll() {
        System.out.println("All things working fine");
    }
}

class n extends Thread {
    int i = 0;

    public void run() {
        while (i < 100) {
            System.out.println("tv is working in tv method");
        }
        i++;
    }

    // public void nexttv() {
    // while (i < 1000) {
    // System.out.println("tv is working in next tv ");
    // }
    // i++;
    // }
}

class n2 extends Thread {
    int i = 0;

    // public void tvmethod() {
    // while (i < 1000) {
    // System.out.println("tv is working in tv method");
    // }
    // i++;
    // }

    public void run() {
        while (i < 100) {
            System.out.println("tv is working in next tv ");
        }
        i++;
    }
}

interface tv extends keyboard {
    // public
    void sound();

    @Override
    default void keys() {
        System.out.println("this is the default keys methos in the tv interface");
    }

    // public
    void displayon();
}

interface keyboard {
    // public
    void keys();
}

public class interfaces4 {
    public static void main(String[] args) {
        // System.out.println("main function");
        // laptop l = new laptop();
        // l.printlaptop();
        // l.checkAll();
        // l.keys();
        n N = new n();
        n2 N1 = new n2();
        N1.start();
        N.start();

    }
}
