import java.util.Scanner;

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
            System.out.println("Pilih: ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan tema seminar: ");
                    String temaSeminar = scanner.nextLine();
                    System.out.println("Masukkan total sesi: ");
                    int totalSesi = scanner.nextInt();
                    System.out.println("Masukkan tanggal seminar (YYYY-MM-DD): ");
                    String tanggalSeminar = scanner.nextLine();

                    
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

                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid!");
                    break;
            }
            scanner.close();
        } while (pilih != 0);
    }
}
