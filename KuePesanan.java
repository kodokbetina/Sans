public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return super.hitungHarga() * berat;
    }

    
    @Override
    public String toString() {
        return "KuePesanan: " + super.toString() + ", Berat: " + berat;
    }

    public double getBerat() {
        return berat;
    }
}