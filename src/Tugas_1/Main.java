package Tugas_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();

        System.out.print("Masukkan nama makanan: ");
        String namaMakanan = input.nextLine();

        System.out.print("Masukkan harga makanan: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();

        MenuMakanan menu = new MenuMakanan(namaMakanan, harga);
        NotaPemesanan nota = new NotaPemesanan(namaPelanggan, menu, jumlah);

        nota.cetakNota();
    }
}
