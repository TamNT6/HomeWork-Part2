import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        USD = sc.nextDouble();
        double quydoi = vnd*USD;
        System.out.println("So tien quy doi la: " + quydoi);
    }
}
