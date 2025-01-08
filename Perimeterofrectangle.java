import java.util.Scanner;

public class Perimeterofrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        int length=sc.nextInt();
        System.out.println("Enter width");
        int width=sc.nextInt();
        int perameter=2 * (length + width);
        System.out.println("Perimeter is: "+perameter);

    }
}