import java.util.Scanner;
public class bai2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chieu rong: ");
        double width = scanner.nextDouble();
        
        System.out.print("Nhap chieu cao: ");
        double height = scanner.nextDouble();
        
        double area = width * height;
        System.out.println("Dien tich hinh chu nhat: " + area);
        
        scanner.close();
    }
}
