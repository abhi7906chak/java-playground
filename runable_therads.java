
// therad using runable is covered and  
// therad constractor and methos is coverd in this code
// 13/01/2024

//This code is for test the file class that it extends the Therad or not 
// Result is :- Working Fine
// public class runable_therads extends Thread {
//     public static void main(String[] args) {
//         runable_therads t = new runable_therads();
//         t.start();
//         for (int i = 0; i < 100; i++) {
//             System.out.println("I am  in the main method");
//         }
//     }

//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("now in the therad class ");

//         }
//     }
// }
// Now I implements the Runnable Therad in the and
//  file class and the another class respectively  // 13/01/2024

// class ruun implements Runnable {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("I am in the Runnable Therad");
//         }
//     }
// }

// class ruun2 implements Runnable {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("I am in the Runnable Therad in class ruun2");
//         }
//     }
// }

// public class runable_therads {
//     public static void main(String[] args) {
//         // System.out.println("In the main method");
//         ruun r1 = new ruun();
//         ruun2 r2 = new ruun2();
//         // Thread t = new Thread(obj1)
//         Thread t = new Thread(r1);
//         t.start();
//         Thread t1 = new Thread(r2);
//         t1.start();
//     }
// }
// now same for file class
public class runable_therads implements Runnable {
    public static void main(String[] args) {
        runable_therads r1 = new runable_therads();
        Thread t1 = new Thread(r1);
        t1.setName("abhi");
        t1.setPriority(10);
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("I am  in the main method");
        }
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("now in the therad class ");

        }
    }
}