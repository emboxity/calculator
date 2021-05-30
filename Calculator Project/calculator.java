
import java.util.Scanner; 
public class calculator
{
public static void main(String [] args){

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two numbers!");

    // Doing doubles to read the next numbers

    double first = reader.nextDouble();
    double second = reader.nextDouble();

    // Printing

    System.out.println("Enter an operator (+, -, *, /): ");

    // Math

    char operator = reader.next().charAt(0);
    double result;

    // Switch statements

    switch(operator)
    {
    case '+':
    result = first + second;
    break;

    case '-':
    result = first - second;
    break;

    case '*':
    result = first * second;
    break;

    case '/':
    result = first / second;
    break;
    

    // errors

    default:
    System.out.println("Error! Please use the operators (+, -, *, /):");
    reader.close();
    return;
    
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    reader.close();


}
}