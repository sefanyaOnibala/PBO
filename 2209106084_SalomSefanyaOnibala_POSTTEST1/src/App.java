import java.util.ArrayList;
import java.util.Scanner;

class Roti {
    private int id;
    private String nama;
    private int harga;
    private int stok;

    private static int idCounter = 1;

    public Roti(String nama, int harga, int stok) {
        this.id = idCounter++;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}

public class App {
    private static ArrayList<Roti> daftarRoti = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            clearScreen();
            System.out.println("=================================================================");
            System.out.println("              Selamat datang di Toko Roti Onibala                ");
            System.out.println("=================================================================");
            System.out.println(" [1] Tambah Roti");
            System.out.println(" [2] Lihat Semua Roti");
            System.out.println(" [3] Perbarui Informasi Roti");
            System.out.println(" [4] Hapus Roti");
            System.out.println(" [5] Keluar");
            System.out.print(" Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahRoti();
                    waitForEnter();
                    break;
                case 2:
                    lihatSemuaRoti();
                    waitForEnter();
                    break;
                case 3:
                    perbaruiRoti();
                    waitForEnter();
                    break;
                case 4:
                    hapusRoti();
                    waitForEnter();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan Toko Roti Onibala");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi");
                    waitForEnter();
            }
        }
    }

    private static void tambahRoti() {
        clearScreen();
        System.out.println("=================================================================");
        System.out.println("              Selamat datang di Toko Roti Onibala                ");
        System.out.println("=================================================================");
        System.out.print("Masukkan nama roti    : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga roti   : ");
        int harga = scanner.nextInt();
        System.out.print("Masukkan stok roti    : ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        Roti roti = new Roti(nama, harga, stok);
        daftarRoti.add(roti);
        System.out.println("Roti berhasil ditambahkan");
    }

    private static void lihatSemuaRoti() {
        clearScreen();
        System.out.println("=================================================================");
        System.out.println("              Selamat datang di Toko Roti Onibala                ");
        System.out.println("=================================================================");

        if (daftarRoti.isEmpty()) {
            System.out.println("Tidak ada roti yang tersedia");
        } else {
            System.out.println("                      DAFTAR ROTI                        ");
            for (Roti roti : daftarRoti) {
                System.out.println(roti.getId() + ". " + roti.getNama());
                System.out.println("   Harga    : Rp. " + roti.getHarga());
                System.out.println("   Stok     : " + roti.getStok());
            }
        }
    }

    private static void perbaruiRoti() {
        clearScreen();
        System.out.println("=================================================================");
        System.out.println("              Selamat datang di Toko Roti Onibala                ");
        System.out.println("=================================================================");

        if (daftarRoti.isEmpty()) {
            System.out.println("Tidak ada roti yang tersedia untuk diperbarui");
            return;
        }

        System.out.print("Masukkan ID roti yang ingin diperbarui: ");
        int idRoti = scanner.nextInt();
        scanner.nextLine();

        for (Roti roti : daftarRoti) {
            if (roti.getId() == idRoti) {
                System.out.print("Masukkan nama baru untuk roti     : ");
                String newNama = scanner.nextLine();
                System.out.print("Masukkan harga baru untuk roti    : ");
                int newHarga = scanner.nextInt();
                System.out.print("Masukkan stok baru untuk roti     : ");
                int newStok = scanner.nextInt();
                scanner.nextLine();

                roti.setNama(newNama);
                roti.setHarga(newHarga);
                roti.setStok(newStok);
                System.out.println("Informasi roti berhasil diperbarui");
                return;
            }
        }
        System.out.println("Roti dengan ID tersebut tidak ditemukan");
    }

    private static void hapusRoti() {
        clearScreen();
        System.out.println("=================================================================");
        System.out.println("              Selamat datang di Toko Roti Onibala                ");
        System.out.println("=================================================================");

        if (daftarRoti.isEmpty()) {
            System.out.println("Tidak ada roti yang tersedia untuk dihapus");
            return;
        }

        System.out.print("Masukkan ID roti yang ingin dihapus: ");
        int idRoti = scanner.nextInt();
        scanner.nextLine();

        //menyimpan indeks item yang ingin dihapus
        int indexHapus = -1;

        //mencari indeks item yang ingin dihapus
        for (int i = 0; i < daftarRoti.size(); i++) {
            Roti roti = daftarRoti.get(i);
            if (roti.getId() == idRoti) {
                indexHapus = i;
                break;
            }
        }
                //menghapus item jika ditemukan
                if (indexHapus != -1) {
                    daftarRoti.remove(indexHapus);
                    System.out.println("Roti berhasil dihapus");
                } else {
                    System.out.println("Roti dengan ID tersebut tidak ditemukan");
                }
            }
        
            private static void clearScreen() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        
            private static void waitForEnter() {
                System.out.println("Tekan Enter untuk melanjutkan...");
                try {
                    System.in.read();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
