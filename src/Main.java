public class Main {
    public static void main(String[] args){
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
//
//        Duck modelduck = new ModelDuck();
//        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
//        modelduck.setFlyBehavior(new FlyWithRocketPower());
//        modelduck.performFly();

        tugas.KeranjangBelanja keranjang = new tugas.KeranjangBelanja();

        // Memilih metode pembayaran secara dinamis
        keranjang.aturStrategiPembayaran(new tugas.PembayaranKartuKredit("1234-5678-9012-3456"));
        keranjang.checkout(100);

        keranjang.aturStrategiPembayaran(new tugas.PembayaranPayPal("Dimas@gmail.com"));
        keranjang.checkout(50);

        keranjang.aturStrategiPembayaran(new tugas.PembayaranBitcoin("1AbCdEfGhIjK1LmNoPqRsTuVwXyZ"));
        keranjang.checkout(200);
    }
}