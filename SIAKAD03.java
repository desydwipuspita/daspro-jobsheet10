import java.util.Scanner;

public class SIAKAD03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        inputNilai(jumlahSiswa, jumlahMatkul, nilai, sc);

        while (true) {
            System.out.println("\n====================================");
            System.out.println("Menu:");
            System.out.println("1. Ubah jumlah siswa");
            System.out.println("2. Ubah jumlah mata kuliah");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan jumlah siswa baru: ");
                jumlahSiswa = sc.nextInt();
                nilai = new int[jumlahSiswa][jumlahMatkul];
                inputNilai(jumlahSiswa, jumlahMatkul, nilai, sc);
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah mata kuliah baru: ");
                jumlahMatkul = sc.nextInt();
                for (int i = 0; i < jumlahSiswa; i++) {
                    int[] newNilai = new int[jumlahMatkul];
                    for (int j = 0; j < Math.min(nilai[i].length, jumlahMatkul); j++) {
                        newNilai[j] = nilai[i][j];
                    }
                    nilai[i] = newNilai;
                }
                inputNilai(jumlahSiswa, jumlahMatkul, nilai, sc);
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPermatkul = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPermatkul / jumlahSiswa);
        }
    }

    public static void inputNilai(int jumlahSiswa, int jumlahMatkul, int[][] nilai, Scanner sc) {
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPersiswa / jumlahMatkul);
        }
    }
}
