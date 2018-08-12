import java.util.Scanner;

public class TinhDiemTrungBinhCacMonHoc {
    public static void main(String[] args) {
        float vatly;
        float hoahoc;
        float sinhhoc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem vatly: ");
        vatly = sc.nextFloat();
        System.out.println("Nhap diem hoahoc: ");
        hoahoc = sc.nextFloat();
        System.out.println("Nhap diem sinhhoc: ");
        sinhhoc = sc.nextFloat();
        float diemtrungbinh = (vatly + hoahoc + sinhhoc)/3;
        System.out.println("Diem trung binh la: " +diemtrungbinh);
    }
}
