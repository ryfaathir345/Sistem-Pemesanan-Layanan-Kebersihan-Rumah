package Tugas_2;

import java.util.Scanner;

/**
 * Kelas utama untuk menjalankan sistem pemesanan layanan kebersihan rumah.
 * Program akan menerima input dari pengguna dan menampilkan nota pemesanan.
 *
 * @author Nama
 * @version 1.0
 */
public class Main {
    /**
     * Method utama yang mengeksekusi program.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();

        System.out.print("Masukkan jenis layanan (misal: Cuci Rumah): ");
        String namaLayanan = input.nextLine();

        System.out.print("Masukkan harga per jam: ");
        double hargaPerJam = input.nextDouble();

        System.out.print("Masukkan durasi (jam): ");
        int jam = input.nextInt();

        LayananKebersihan layanan = new LayananKebersihan(namaLayanan, hargaPerJam);
        PesananKebersihan pesanan = new PesananKebersihan(namaPelanggan, layanan, jam);

        System.out.println();
        pesanan.cetakNota();
    }
}
