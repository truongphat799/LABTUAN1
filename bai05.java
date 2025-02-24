import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nhap so thu hai: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Nhap so thu ba: ");
        int num3 = scanner.nextInt();
        
        int min = Math.min(num1, Math.min(num2, num3));
        
        System.out.println("Gia tri nho nhat la: " + min);
        
        scanner.close();
    }
}
