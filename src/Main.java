import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (c < 0) {
            System.out.println("NO SOLUTION");
        }
        else if (a == 0) {
            if (c * c - b == 0) {
                System.out.println("MANY SOLUTIONS");
            }
            else {
                System.out.println("NO SOLUTION");
            }
        }
        else {
            if ((c * c - b) % a == 0){
                System.out.println((c * c - b) / a);
            }
            else {
                System.out.println("NO SOLUTION");
            }
        }
    }
}
