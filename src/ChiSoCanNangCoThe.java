import java.util.Scanner;

public class ChiSoCanNangCoThe {
    public static void main(String[] args) {
        double chieucao;
        double cannang;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao (tinh theo m): ");
        chieucao = sc.nextDouble();
        System.out.println("Nhap can nang (tinh theo kg): ");
        cannang = sc.nextDouble();
        double BMI = cannang/(chieucao*chieucao);
        System.out.printf("BMI = %.2f", BMI);
        System.out.println("\n");
        System.out.println("Phan loai: ");
        System.out.println("\n");
        if (BMI<18.5){
            System.out.println("Underweight");
        }else if (BMI<25) {
            System.out.println("Normal");
        } else if (BMI<30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        }

    }

