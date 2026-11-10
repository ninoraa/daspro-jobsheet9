import java.util.Scanner;
import java.util.Arrays;

public class SearchNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Banyak elemen : ");
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + " : ");
            data[i] = sc.nextInt();
        }
        System.out.print("Nilai yang dicari : ");
        int key = sc.nextInt();

        int posisi = -1;
        for (int i = 0; i < n; i++) {
            if (data[i] == key) { posisi = i; break; }
        }
        if (posisi != -1) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan dalam array " + Arrays.toString(data));
        }
    }
}