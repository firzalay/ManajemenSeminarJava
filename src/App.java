import java.util.Scanner;
import model.Seminar;
import dao.SeminarDAO;

public class App {
    public static void main(String[] args) throws Exception {
        int pilih = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n=== Sistem Seminar ===");
            System.out.println("1. Tambah Seminar");
            System.out.println("2. Daftar Seminar");
            System.out.println("3. Input Kehadiran");
            System.out.println("4. Cek Kelulusan");
            System.out.println("5. Cetak Sertifikat");
            System.out.println("6. Lihat Serfikiat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scanner.nextInt();

            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan tema seminar: ");
                    String temaSeminar = scanner.nextLine();
                    System.out.print("Masukkan total sesi: ");
                    int totalSesi = scanner.nextInt();
                    System.out.print("Masukkan tanggal seminar (YYYY-MM-DD): ");
                    String tanggalSeminar = scanner.next();
                    Seminar seminar = new Seminar(temaSeminar, totalSesi, tanggalSeminar);
                    
                    SeminarDAO.create(seminar);
                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;
                case 0: 
                    System.out.println("Terimakasih...");
                    break;

                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid!");
                    break;
            }
        } while (pilih != 0);
        scanner.close();
    }

}
