import java.util.Scanner;

public class Powercalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base:");
        double base=sc.nextDouble();
        System.out.println("Enter exponent:");
        double exponent=sc.nextDouble();
        double result=Math.pow(base,exponent);
        System.out.println("result: "+result);
    }
}