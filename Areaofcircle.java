import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius=sc.nextInt();
        float area=(22/7* radius^2);
        System.out.println("Area of circle is:"+area);

    }
}
