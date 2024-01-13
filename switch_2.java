import java.util.Scanner;

public class switch_2 {
    public static void main(String[] a) {

        System.out.println("Enter your string");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // System.out.println(s);
        switch (s) {
            case "abhi" -> System.out.println(s.toUpperCase());
            case "chak" -> System.out.println(s.replace("c", "A"));
            case "kumar" -> System.out.println(s.matches("kumar"));
            // break;

            default -> System.out.println(s.length());
        }
        scan.close();

    }
}
