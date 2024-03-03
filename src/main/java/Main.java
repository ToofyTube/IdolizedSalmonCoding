import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter weight in pounds:");
    Scanner input = new Scanner(System.in);
      double  pound = Double.parseDouble(input.nextLine());
    System.out.println("Enter Feet:");
    input = new Scanner(System.in);
    Double feet = Double.parseDouble(input.nextLine());
    System.out.println("Enter inches:");
    input = new Scanner(System.in);
    double inches = Double.parseDouble(input.nextLine());
    //make calsses for each unit we need (pounds, feet, inches)
    
    double Meters = ((+feet * 12) + inches) * 0.0254;
    double Kilograms = pound * 0.45359237;
    // convert feet ,inches and pounds to meters and kilograms
    

    double bmi = Kilograms / (Meters * Meters); 
      //divide Kilograms by Meters squared to get the final BMI

    System.out.println("BMI is " + bmi);
    //print out the BMI
  }
}