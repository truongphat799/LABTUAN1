import java.util.Scanner;
    public class bai12 {
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        
        int original = num;
        int reversed = 0;
        
        do {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        } while (num != 0);
        
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println(number + " la so doi xung");
        } else {
            System.out.println(number + " khong phai so doi xung");
        }
        
        scanner.close();
    }
}

    

