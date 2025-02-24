import java.util.Scanner;

public class bai10 {
    public static int countDigits(int num) {
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num != 0);
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();
        
        System.out.println("So chu so: " + countDigits(number));
        
        scanner.close();
    }
}
