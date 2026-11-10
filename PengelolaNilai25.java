import java.util.Locale;
import java.util.Scanner;

public class PengelolaNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //saya pakai dowhile agar ada tulisan saat input tidak valid
        int jumlah;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            jumlah = input.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0, silakan ulangi.");
            }
        } while (jumlah <= 0);

        int[] nilai = new int[jumlah];
        int total = 0;

        
        for (int i = 0; i < nilai.length; i++) {
            do {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = input.nextInt();
                if (nilai[i] < 0 || nilai[i] > 100) {
                    System.out.println("Nilai harus antara 0 sampai 100, silakan ulangi.");
                }
            } while (nilai[i] < 0 || nilai[i] > 100);
            total += nilai[i];
        }

    
        double rata2 = (double) total / nilai.length;

        
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

    
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println();
        System.out.printf("Rata-rata nilai : %.2f%n", rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
    }
}
