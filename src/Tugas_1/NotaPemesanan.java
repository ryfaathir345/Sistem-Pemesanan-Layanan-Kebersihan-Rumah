package Tugas_1;

public class NotaPemesanan {
    String namaPelanggan;
    MenuMakanan menu;
    int jumlah;

    public NotaPemesanan(String namaPelanggan, MenuMakanan menu, int jumlah) {
        this.namaPelanggan = namaPelanggan;
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        System.out.println("");
        System.out.println("===== NOTA PEMESANAN =====");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Menu : " + menu.namaMakanan);
        System.out.println("Harga : Rp " + menu.harga);
        System.out.println("Jumlah : " + jumlah);

        // Bagian ini menggunakan Custom Live Template
        double total = menu.harga * jumlah;
        double diskon = total * 10 / 100;
        double bayar = total - diskon;
        System.out.println("Total Bayar: Rp " + bayar);
        

        System.out.println("==========================");
    }
}
