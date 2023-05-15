public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungHarga() {
        return harga;
    }

    public String toString() {
        return nama;
    }
}