import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem mon ly: ");
        double physic = scanner.nextDouble();

        System.out.println("Nhap diem mon hoa:  ");
        double chemistry = scanner.nextDouble();

        System.out.println("Nhap diem mon sinh: ");
        double biology = scanner.nextDouble();

        System.out.println("Nhap diem mon toan: ");
        double math = scanner.nextDouble();
        
        System.out.println("Nhap diem mon may tinh: ");
        double computer = scanner.nextDouble();

        double totalMarks = physic + chemistry + biology + math + computer;
        double percentage = (totalMarks / 5) * 10;

        String grade;
        if (percentage > 90) {
            grade = "A";
        } else if ( percentage > 80) {
            grade = "B";
        } else if ( percentage > 70) {
            grade = "C";
        } else if ( percentage > 60) {
            grade = "D";
        } else if ( percentage > 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("Ty le phan tram: " + percentage + "%");
        System.out.println("Hang: " + grade);

        scanner.close();

    }
}
