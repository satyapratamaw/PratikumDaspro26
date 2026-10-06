import java.util.Scanner;
public class StudiKasus1VersiFullAbsen26 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int hargaPerCup = 1800;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah cup : ");
        jumlahCup = Input.nextInt();
        System.out.println("Masukkan uang bayar : ");
        uangBayar = Input.nextInt();
        
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if(totalHarga >=100000) {
            diskon = totalHarga * 10/100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("total harga : Rp " + totalHarga);
        System.out.println("diskon : Rp " + diskon);
        System.out.println("total Bayar : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("uang tidak cukup, kurang : Rp " + kurang);
        }
    }
}