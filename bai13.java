import java.util.Scanner;
public class bai13 {
    public static int countWords(String str) {
        if (str.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        
        System.out.println("So tu trong chuoi: " + countWords(input));
        
        scanner.close();
    }
}