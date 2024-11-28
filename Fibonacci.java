public class Fibonacci {
    static int totalPasangan(int produktif, int belumProduktif, int bulan) {
        if (bulan == 11) {
            return 1;
        } else {
            int totalPasangan = produktif + belumProduktif;
            return belumProduktif + totalPasangan(belumProduktif, totalPasangan, bulan + 1);
        }
    }
    // totalPasangan(0,1,1) = 1 + totalPasangan(1,0+1,2)
    //                      = 1 + (1 + totalPasangan(1,1+1,3))
    //                      = 1 + (1 + (2 + totalPasangan(2,1+2,4)))
    //                      = 1 + (1 + (2 + (3 + totalPasangan(3,2+3,5))))
    //                      = 1 + (1 + (2 + (3 + (5 + totalPasangan(5,3+5,6)))))
    //                      = 1 + 1 + 2 + 3 + 5 + 1 <- bulan 6
    //                      = 13
    public static void main(String[] args) {
        System.out.println(totalPasangan(0, 1, 1));
    }
}
// bulan  : x + y = (x+y)
//          y + (x+y) = x+2y
//          (x+y) + (x+2y) = 2x+3y
//          (x+2y) + (2x+3y) = 3x+5y
// bulan 1: 0 + 1 = 1
// bulan 2: 0 + 1 = 1
// bulan 3: 1 + 1 = 2
// bulan 4: 1 + 2 = 3
// bulan 5: 2 + 3 = 5