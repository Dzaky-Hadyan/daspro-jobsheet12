import java.util.Scanner;

public class DeretDescendingRekursif {
    static String deretRekursif(int n) {
        if (n == 0) {
            return "0";
        } else {
            return String.valueOf(n) + deretRekursif(n - 1);
        }
    }
    static int deretIteratif(int n) {
        int i = 0;
        for (;n > 0; n--) {
            i = n;
            System.out.print(i);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();
        System.out.println(deretRekursif(n));
        System.out.println(deretIteratif(n));
        sc.close();
    }
}