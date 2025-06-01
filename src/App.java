import java.util.Scanner;

import model.Kehadiran;
import model.Pendaftaran;
import model.Peserta;
import model.Seminar;
import dao.KehadiranDAO;
import dao.PendaftaranDAO;
import dao.PesertaDAO;
import dao.SeminarDAO;

public class App {
    public static void main(String[] args) throws Exception {
        int pilih = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            // TODO : Bisa dibuat menjadi menu dan sub menu
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
                    // TODO (important): Jika data peserta sudah ada buat pengkondisian
                    System.out.print("Masukkan nama peserta: ");
                    String namaPeserta = scanner.nextLine();
                    System.out.print("Masukkan email peserta: ");
                    String emailPeserta = scanner.next();
                    System.out.println("=== Daftar Seminar ===");

                    Peserta peserta = new Peserta(namaPeserta, emailPeserta);
                    PesertaDAO.create(peserta);

                    for (Seminar allSeminar : SeminarDAO.getAllSeminar()) {
                        System.out.println(allSeminar.getId_seminar() + " - " + allSeminar.getTema());

                    }

                    // TODO (important): Buat pengkondisian jika id / nomer seminar tidak ditemukan
                    System.out.print("Pilih ID seminar yang ingin diikuti: ");
                    int idSeminar = scanner.nextInt();
                    int idPeserta = PesertaDAO.getLatestId();
                    Pendaftaran pendaftaran = new Pendaftaran(idPeserta, idSeminar);
                    PendaftaranDAO.create(pendaftaran);

                    break;

                case 3:
                    System.out.println("=== Input Kehadiran ===");
                    System.out.print("Masukkan ID Peserta: ");
                    idPeserta = scanner.nextInt();

                    System.out.println("Seminar yang diikuti: ");
                    for (Seminar allSeminarByPeserta : SeminarDAO.getAllSeminarByPeserta(idPeserta)) {
                        System.out.println(allSeminarByPeserta.getId_seminar() + " - " + allSeminarByPeserta.getTema());
                    }

                    System.out.print("Masukkan ID Seminar: ");
                    idSeminar = scanner.nextInt();

                    int idPendaftaran = PendaftaranDAO.getIdPendaftaran(idPeserta, idSeminar);

                    System.out.print("Masukkan Sesi ke - : ");
                    int sesiKe = scanner.nextInt();

                    System.out.print("Hadir? (y/n) : ");
                    String kondisiHadir = scanner.next();

                    if (kondisiHadir.equals("y")) {
                        Kehadiran kehadiran = new Kehadiran(idPendaftaran, sesiKe, "hadir");
                        KehadiranDAO.create(kehadiran);
                    } else if (kondisiHadir.equals("n")) {
                        Kehadiran kehadiran = new Kehadiran(idPendaftaran, sesiKe, "tidak hadir");
                        KehadiranDAO.create(kehadiran);
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }

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
