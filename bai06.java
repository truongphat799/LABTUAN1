import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat cua tam giac: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap canh thu hai cua tam giac: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap canh thu ba cua tam giac: ");
        double c = scanner.nextDouble();

        if ( a + b > c && a + c > b && b + c > a) {
            System.out.println("Day dung la tam giac.");

        } else {
            System.out.println("Day khong phai la tam giac.");
        }
        scanner.close();
    }
}
