// In this code i try method in java and forEach loop and object making and some recursion in java;
// 01/07/2024

public class methods_3 {
    public static void main(String[] args) {
        // System.out.println(sum(2, 3));
        // object making in java
        methods_3 m = new methods_3();
        System.out.println(m.sum(3, 4));
        // forEach loop printing in java
        System.out.println("Now in the for each loop:- ");
        sum1(1, 2, 3, 4);
        // For factorial of N numbers With Recusion;
        System.out.println("The factorial is:- ");
        System.out.println(factorial(4));
        // For fibonachi with Recusion
        System.out.println(fiboonachi(4));

    }

    // A static method in java
    static int sum1(int... a) {
        // int sum = 0;
        for (int data : a) {
            System.out.println(data);
        }
        return 0;
    }

    // A Non static method in java
    int sum(int num1, int num2) {
        return num1 + num2;
    }

    static int fiboonachi(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return fiboonachi(num - 2) + fiboonachi(num - 1);
    }

    // Factorail method with recursion
    static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
