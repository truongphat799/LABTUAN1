import java.util.Scanner;

public class bai9 {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int productOfDigits(int num) {
        int product = 1;
        while (num != 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();
        
        System.out.println("Tong cac chu so: " + sumOfDigits(number));
        System.out.println("Tich cac chu so: " + productOfDigits(number));
        
        scanner.close();
    }
}
