import java.util.Scanner;

public class Volumeofcylender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius=sc.nextInt();
        System.out.println("Enter height:");
        int height=sc.nextInt();
        float volume= 22/7 * radius^2 * height;
        System.out.println("volume is: "+ volume);
    }
}
