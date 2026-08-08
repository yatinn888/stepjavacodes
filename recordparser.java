import java.util.Scanner;

public class StudentRecord  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] data = input.split(",");

        if (data.length == 3) {
            System.out.println("Name: " + data[0]);
            System.out.println("Roll No: " + data[1]);
            System.out.println("Dept: " + data[2]);
        } 
        else {
            System.out.println("Invalid Record");
        }
    }
}
