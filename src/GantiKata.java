import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini mengganti kata dalam sebuah kalimat
 * dimana user yang menginput
 */

public class GantiKata {
    public static void main(String[] args) {
        Scanner scanner;
        String kataBaru,
                kataLama,
                kalimatLama,
                kalimatBaru;

        scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");
        System.out.print("\n");
        System.out.print("Masukkan Kalimat: ");
        kalimatLama = scanner.nextLine();

        System.out.print("Ganti Kata: ");
        kataLama = scanner.nextLine();
        System.out.print("Menjadi Kata: ");
        kataBaru = scanner.nextLine();

        kalimatBaru = kalimatLama.replace(kataLama, kataBaru);
        System.out.print("\n");
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimatLama);
        System.out.print("Kalimat baru : " + kalimatBaru);
    }
}
