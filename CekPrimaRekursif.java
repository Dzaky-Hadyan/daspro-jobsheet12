import java.util.Scanner;

public class CekPrimaRekursif {
    static String cekPrima(int n, int i) {
        if (i >= 2) {
            if (n % i != 0) {
                return cekPrima(n, i - 1);
            } else {
                return "Bukan Prima";
            }
        } else {
            return "Prima";
        }
        // 5 % 4 != 0 (5 % 4 != 0 && i >= 2) lanjut karena != dan >= terpenuhi
        // 5 % 3 != 0 (5 % 3 != 0 && 3 >= 2) lanjut karena != dan >= terpenuhi
        // 5 % 2 != 0 (5 % 2 != 0 && 2 >= 2) lanjut karena != dan >= terpenuhi
        // (5 % 1 != 0 && 1 >= 2) tidak lanjut karena keduanya tidak terpenuhi
        // "Prima"
        // 4 % 3 != 0 (4 % 3 != 0 && 3 >= 2) lanjut karena != dan >= terpenuhi
        // 4 % 2 = 0 (4 % 2 != 0 && 2 >= 2) tidak lanjut karena pertama tidak terpenuhi
        // "Bukan Prima"
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        int i = bilangan - 1;
        System.out.println(cekPrima(bilangan, i));
        sc.close();
    }
}