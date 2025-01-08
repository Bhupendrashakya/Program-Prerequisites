import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float avg=(a+b+c)/3;
        System.out.println("The avarage is: "+avg);
    }
}