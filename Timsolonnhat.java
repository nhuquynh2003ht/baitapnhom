import java.util.Scanner;

public class Timsolonnhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = input.nextInt();
        System.out.println("Nhap b: ");
        int b = input.nextInt();
        System.out.println("Nhap c: ");
        int c = input.nextInt();
        System.out.println("Nhap d: ");
        int d = input.nextInt();

        if (a >= b && a >= c && a >= d) {
            System.out.println(a + "\t a lon nhat");
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b + "\t b lon nhat");
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c + "\t c lon nhat");
        } else {
            System.out.println(d + "\t d lon nhat");
        }
    }
}
