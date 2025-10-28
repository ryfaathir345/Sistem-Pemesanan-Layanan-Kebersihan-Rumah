package Tugas_2;

/**
 * Kelas ini merepresentasikan pesanan layanan kebersihan
 * dari seorang pelanggan.
 *
 * @author Nama
 * @version 1.0
 */
public class PesananKebersihan {
    private String namaPelanggan;
    private LayananKebersihan layanan;
    private int durasiJam;

    /**
     * Konstruktor untuk membuat objek PesananKebersihan.
     *
     * @param namaPelanggan Nama pelanggan yang memesan
     * @param layanan Jenis layanan kebersihan yang dipesan
     * @param durasiJam Durasi layanan dalam jam
     */
    public PesananKebersihan(String namaPelanggan, LayananKebersihan layanan, int durasiJam) {
        this.namaPelanggan = namaPelanggan;
        this.layanan = layanan;
        this.durasiJam = durasiJam;
    }

    /**
     * Menghitung total biaya untuk pesanan layanan kebersihan.
     *
     * @return Total biaya yang harus dibayar pelanggan
     */
    public double getTotalBiaya() {
        return layanan.hitungBiaya(durasiJam);
    }

    /**
     * Menampilkan nota pesanan ke layar.
     */
    public void cetakNota() {
        System.out.println("===== NOTA PEMESANAN LAYANAN KEBERSIHAN =====");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Layanan        : " + layanan.getNamaLayanan());
        System.out.println("Durasi         : " + durasiJam + " jam");
        System.out.println("Harga per Jam  : Rp " + layanan.getHargaPerJam());
        System.out.println("Total Bayar    : Rp " + getTotalBiaya());
        System.out.println("================================================");
    }
}
