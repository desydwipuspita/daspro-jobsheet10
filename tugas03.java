import java.util.Scanner;

public class tugas03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] hasilSurvey = new int[10][6];
        int[] rataResponden = new int[10];
        int[] rataPertanyaan = new int[6];
        int rataKeseluruhan;
        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvey[i][j] = scanner.nextInt();

            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += hasilSurvey[i][j];
            }
            rataResponden[i] = total / 6;
            total = 0;
        }

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 10; i++) {
                total += hasilSurvey[i][j];
            }
            rataPertanyaan[j] = total / 10;
            total = 0;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += hasilSurvey[i][j];
            }
        }
        rataKeseluruhan = total / (10 * 6);

        System.out.println("\nRata-rata Responden:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ": " + rataResponden[i]);
        }

        System.out.println("\nRata-rata Pertanyaan:");
        for (int j = 0; j < 6; j++) {
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataPertanyaan[j]);
        }

        System.out.println("\nRata-rata Keseluruhan: " + rataKeseluruhan);

    }
}
