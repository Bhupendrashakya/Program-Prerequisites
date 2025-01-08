import java.util.Scanner;

public class Celsiustofahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");
        float Celsius=sc.nextInt();
        float fahrenheit=(Celsius * 9/5) + 32;
        System.out.println("Temprature in Fahrenheit is: "+fahrenheit );

    }
}