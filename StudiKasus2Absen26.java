import java.util.Scanner;
public class StudiKasus2Absen26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String nama, jenis;
        int jumlahDokumen, peringkat, statusPKM;

        System.out.print("Nama mahasiswa  : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = input.nextLine().trim().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Jumlah dokumen  : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap dan meraih Juara " + peringkat
                            + "Dana penghargaan diberikan");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen) Dana penghargaan tidak diberikan");
                }
            }
        }
    }
}