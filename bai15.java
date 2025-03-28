import java.util.Scanner;
public class bai15 {
    public static void splitDate(String date) {
        String day = "";
        String month = "";
        String year = "";
        
        String[] parts = date.trim().split("[/]");
        
        if (parts.length == 3) {
            day = parts[0];
            month = parts[1];
            year = parts[2];
        }
        
        System.out.println("Ngay: " + day);
        System.out.println("Thang: " + month);
        System.out.println("Nam: " + year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay (dd/mm/yyyy): ");
        String date = scanner.nextLine();
        
        splitDate(date);
        
        scanner.close();
    }
}