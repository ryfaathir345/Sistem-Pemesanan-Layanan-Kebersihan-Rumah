package Tugas_2;

/**
 * Kelas ini merepresentasikan jenis layanan kebersihan
 * yang tersedia dalam sistem.
 *
 * @author Nama
 * @version 1.0
 */
public class LayananKebersihan {
    private String namaLayanan;
    private double hargaPerJam;

    /**
     * Konstruktor untuk membuat objek LayananKebersihan baru.
     *
     * @param namaLayanan Nama layanan kebersihan (contoh: "Cuci Rumah")
     * @param hargaPerJam Harga per jam untuk layanan tersebut
     */
    public LayananKebersihan(String namaLayanan, double hargaPerJam) {
        this.namaLayanan = namaLayanan;
        this.hargaPerJam = hargaPerJam;
    }

    /**
     * Mengambil nama layanan kebersihan.
     *
     * @return Nama layanan
     */
    public String getNamaLayanan() {
        return namaLayanan;
    }

    /**
     * Mengambil harga per jam dari layanan.
     *
     * @return Harga per jam
     */
    public double getHargaPerJam() {
        return hargaPerJam;
    }

    /**
     * Menghitung total harga berdasarkan durasi (jam).
     *
     * @param jam Jumlah jam kerja
     * @return Total biaya layanan
     */
    public double hitungBiaya(int jam) {
        return hargaPerJam * jam;
    }
}
