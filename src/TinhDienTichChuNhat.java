import java.util.Scanner;

public class TinhDienTichChuNhat {
    public static void main(String[] args) {
        float cr;
        float cd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cr: ");
        cr = sc.nextFloat();
        System.out.println("Nhap cd: ");
        cd = sc.nextFloat();
        float dientich = cr * cd;
        System.out.println("Dien tich hinh chu nhat la" +dientich);
    }
}
