import java.util.Scanner;
public class bai11 {
    public static int reverse(int num) {
        int reversed = 0;
        do {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        } while (num != 0);
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();
        
        System.out.println("So dao nguoc: " + reverse(number));
        
        scanner.close();
    }
}

