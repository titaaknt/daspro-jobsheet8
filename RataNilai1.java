import java.util.Scanner;
public class RataNilai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j;
        float nilai, totalNilai = 0, rataNilai;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Input Nilai Mahasiswa ke " + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            
        }
    }
}