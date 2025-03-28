import java.util.Scanner;
public class bai14 { 
    public static void splitName(String fullName) {
        String ho = "";
        String tenDem = "";
        String ten = "";
        
        String[] parts = fullName.trim().split("\\s+");
        
        if (parts.length >= 1) {
            ho = parts[0];
        }
        if (parts.length >= 2) {
            ten = parts[parts.length - 1];
            if (parts.length > 2) {
                tenDem = "";
                for (int i = 1; i < parts.length - 1; i++) {
                    tenDem += parts[i] + " ";
                }
                tenDem = tenDem.trim();
            }
        }
        
        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + tenDem);
        System.out.println("Ten: " + ten);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = scanner.nextLine();
        
        splitName(fullName);
        
        scanner.close();
    }
}