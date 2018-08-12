import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Nhap a = ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Nhap b= ");
        double b = sc.nextDouble();
        double nghiem;
        if (a == 0) {
            if (b != 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh vo so nghiem!");
            }
        } else {
            nghiem = -b / a;
            System.out.printf("Nghiem cua phuong trinh la: %.2f ", nghiem);
        }
    }
}