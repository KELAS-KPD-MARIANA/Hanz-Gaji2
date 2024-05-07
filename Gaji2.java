
package gaji2;
import java.util.Scanner;
public class Gaji2 {

    
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiAsas = 1100;
        System.out.print("Masukkan bilangan pelanggan: ");
        int bilanganPelanggan = input.nextInt();

        int bonus = 0;
        if (bilanganPelanggan >= 40) {
            bonus = 10000;
        } else if (bilanganPelanggan >= 30) {
            bonus = 8000;
        } else if (bilanganPelanggan >= 20) {
            bonus = 6000;
        } else if (bilanganPelanggan >= 10) {
            bonus = 4000;
        } else if (bilanganPelanggan >= 1) {
            bonus = 2000;
        }

        
        int jumlahGaji = gajiAsas + bonus;

        System.out.println("Bilangan Pelanggan: " + bilanganPelanggan);
        System.out.println("Jumlah Gaji :RM" + jumlahGaji);
    }
}