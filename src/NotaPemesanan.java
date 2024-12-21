//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class NotaPemesanan {
    private String namaPelanggan;
    private String pesanan;
    private int jumlah;
    private double harga;

    public NotaPemesanan(String namaPelanggan, String pesanan, int jumlah, double harga) {
        this.namaPelanggan = namaPelanggan;
        this.pesanan = pesanan;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public double hitungTotalHarga() {
        return jumlah * harga;
    }

    public void cetakNota() {
        System.out.println("========== NOTA PEMESANAN ==========");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Pesanan        : " + pesanan);
        System.out.println("Jumlah         : " + jumlah);
        System.out.println("Total Harga    : Rp " + hitungTotalHarga());
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Nama Pesanan: ");
        String pesanan = scanner.nextLine();
        System.out.print("Masukkan Jumlah Pesanan: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga per Item: ");
        double harga = scanner.nextDouble();

        NotaPemesanan nota = new NotaPemesanan(nama, pesanan, jumlah, harga);
        nota.cetakNota();
    }
}