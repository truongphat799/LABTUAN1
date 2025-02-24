import java.util.Scanner;

public class bai8 {
    public static int firstDigit(int num) {
        while (num >= 10) num /= 10;
        return num;
    }

    public static int lastDigit(int num) {
        return num % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();
        
        System.out.println("Chu so dau tien: " + firstDigit(number));
        System.out.println("Chu so cuoi cung: " + lastDigit(number));
        
        scanner.close();
    }
}
