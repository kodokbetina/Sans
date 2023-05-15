public class KueJadi extends Kue {
    private int jumlah;

    public KueJadi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return super.hitungHarga() * jumlah * 2;
    }

    @Override
    public String toString() {
        return "KueJadi: " + super.toString() + ", Jumlah: " + jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }
}