import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // BMI = Weight(KG) / (Height(M) * Height(M))

        double height,weight,bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your weight in kilograms: ");
        weight = input.nextDouble();
        System.out.print("Please enter your height in meters: ");
        height = input.nextDouble();

        bmi = weight / (Math.pow(height,2));

        System.out.println("Your Body Mass Index (bmi) : " + bmi);

    }
}
