import java.util.Scanner;

public class PenjumlahanRekursif {
    static int penjumlahan(int f) {
        if (f == 1) {
            return 1;
        } else {
            return f + penjumlahan(f - 1);
        }
    }
    public static void printDeret(int f) {
        for (int i = 1; i <= f; i++) {
            if (i != f) {
                System.out.print(String.valueOf(i) + "+");
            } else {
                System.out.print(String.valueOf(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("f = ");
        int bilangan = sc.nextInt();
        printDeret(bilangan);
        System.out.print(" = " + penjumlahan(bilangan));
        sc.close();
    }
}
