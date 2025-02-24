import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Nhập nhiệt độ (oF): ");
       double fahrenheit = scanner.nextDouble();

       double celsius = (fahrenheit - 32) / 1.8;
       System.out.println("Nhiệt độ tương ứng (oC): " + celsius);

       scanner.close();

    }
}
