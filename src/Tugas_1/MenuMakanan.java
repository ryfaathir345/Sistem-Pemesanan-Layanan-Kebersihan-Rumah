package Tugas_1;

public class MenuMakanan {
    String namaMakanan;
    double harga;

    public MenuMakanan(String namaMakanan, double harga) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
    }

    public double getTotal(int jumlah) {
        return harga * jumlah;
    }
}

