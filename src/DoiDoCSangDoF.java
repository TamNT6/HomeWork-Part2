import java.util.Scanner;

public class DoiDoCSangDoF {
    public static void main(String[] args) {
        float doC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do C: ");
        doC = sc.nextFloat();
        float doF = (9*doC+160)/5;
        System.out.println("Quy doi sang do F là:" +doF);
    }
}
