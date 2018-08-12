import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] array = {"Suu", "Mây", "Tâm", "Bon"};
        System.out.println("Nhap vao gia tri can tim: ");
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        boolean isExist;
        for (int i = 0; i <= 3; i++) {
            if (ten.equals(array[i])) {
                isExist = true;
                System.out.println("Vi tri thu: " + (i+1));
                break;
            } else {
                isExist=false;
                System.out.println("Gia tri nhap khong ton tai!");
            }
        }
    }
}

