import java.util.Scanner;

public class TinhChuViVaDienTichHinhTron {
    public static void main(String[] args) {
        float r;
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap r: ");
        r = sc.nextFloat();
        float chuvihinhtron = 2*r*pi;
        System.out.println("Chu vi hinh tron là: " + chuvihinhtron);
        float dientichhinhtron = pi*r*r;
        System.out.println("Dien tich hinh tron là: " + dientichhinhtron);
    }
}
