import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        int namsinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam sinh: ");
        namsinh = sc.nextInt();
        int sotuoi = 2018 - namsinh;
        System.out.println("Tuoi cua ban la:" + sotuoi);
        sotuoi = sc.nextInt();
    }
}
