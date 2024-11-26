import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            int opsi = sc.nextInt();
            sc.nextLine();

            if (opsi == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Baris atau kolom tidak valid! Masukkan nomor baris antara 1 hingga 4 dan kolom antara 1 hingga 2.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " sudah ditempati, Silahkan pilih kursi lain");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan.");
                }
            } else if (opsi == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": ***");
                        }
                    }
                }
            } else if (opsi == 3) {
                System.out.println("Terima kasih!");
                System.exit(0);
            } else {
                System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
