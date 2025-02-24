import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap nam: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " la nam nhuan.");
        } else {
            System.out.println(year + " khong phai la nam nhuan.");
        }
        
        scanner.close();
    }
}
