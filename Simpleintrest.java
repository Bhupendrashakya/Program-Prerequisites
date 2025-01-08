import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pricipal amount:");
        int amount=sc.nextInt();
        System.out.println("Enter rate:");
        int rate=sc.nextInt();
        System.out.println("Enter time");
        int time=sc.nextInt();
        float intrest=(amount*rate*time)/100;
        System.out.println("Simple intrest is: "+intrest);
    }
}
