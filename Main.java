public  class Main {
    public static void main(String[] args) {
    Kue[] kueArray = new Kue[20];
    kueArray[0] = new KuePesanan("Kue Lapis", 15000, 2.5);
    kueArray[1] = new KueJadi("Bolu Kukus", 10000, 10);
    kueArray[2] = new KuePesanan("Bolu Klemben", 20000, 1.5);
    kueArray[3] = new KueJadi("Brownis", 5000, 20);
    kueArray[4] = new KuePesanan("Kue Lumpur",  8000, 2.0);
    kueArray[5] = new KueJadi("Roti Kukus", 50000, 5);
    kueArray[6] = new KuePesanan("Terang Bulan", 25000, 1.0);
    kueArray[7] = new KueJadi("Pastel", 15000,  15);
    kueArray[8] = new KuePesanan("Pisang  Goreng", 10000, 2.5);
    kueArray[9] = new KueJadi("Fish Cake", 30000, 4);
    kueArray[10] = new KuePesanan("Roti Bakar", 12000, 3.0);
    kueArray[11] = new KueJadi("Serabi", 12000, 30);
    kueArray[12] = new KuePesanan("Lumpia", 15000, 2.0);
    kueArray[13] = new KueJadi("Kue Sus", 10000, 12);
    kueArray[14] = new KuePesanan("Talam Ubi", 9000, 2.5);
    kueArray[15] = new KueJadi("Kue Tar", 35000,  3);
    kueArray[16] = new KuePesanan("Nastar",  18000, 1.5);
    kueArray[17] = new KueJadi("Petulo", 10000, 8);
    kueArray[18] = new KuePesanan("Bika Ambon", 25000, 1.0);
    kueArray[19] = new KueJadi("Madu Mongso", 12000, 20);
    double totalHarga = 0;
    double totalBeratKuePesanan = 0;
    double totalHargaKuePesanan = 0;
    int totalJumlahKueJadi = 0;
    double totalHargaKueJadi = 0;
    double maxHarga = 0;
    Kue kueTermahal = null;
    for (Kue kue : kueArray) {
    System.out.println(kue);
    totalHarga += kue.hitungHarga();
    if (kue instanceof KuePesanan) {
    KuePesanan kuePesanan = (KuePesanan) 
   kue;
    totalBeratKuePesanan += 
   kuePesanan.getBerat();
    totalHargaKuePesanan += 
   kuePesanan.hitungHarga();
    } else if (kue instanceof KueJadi) {
    KueJadi kueJadi = (KueJadi) kue;
    totalJumlahKueJadi += 
   kueJadi.getJumlah();
    totalHargaKueJadi += 
   kueJadi.hitungHarga();
    }
    if (kue.hitungHarga() > maxHarga) {
    maxHarga = kue.hitungHarga();
    kueTermahal = kue;
    }
    }
    System.out.println("Total harga semua kue: " 
   + totalHarga);
    System.out.println("Total berat Kue Pesanan: " + totalBeratKuePesanan);
    System.out.println("Total harga Kue Pesanan: " + totalHargaKuePesanan);
    System.out.println("Total jumlah Kue Jadi: " + totalJumlahKueJadi);
    System.out.println("Total harga Kue Jadi: " + totalHargaKueJadi);
    System.out.println("Informasi kue dengan  harga terbesar: " + maxHarga);
    }
   }
    
    

