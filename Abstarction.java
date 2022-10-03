import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        FloatCalculator calculation=new FloatCalculator();

        System.out.println("Enter the operation to be performed:(+ or -)");
        char operation=input.next().charAt(0);
        if(operation=='+')
        {
            System.out.println("If ypu want int or float addiion:");
            input.nextLine();
            String calculationType=input.nextLine();
            if(calculationType.equals("int"))
            {int numberOne=input.nextInt();
                int numberTwo=input.nextInt();
                System.out.println(calculation.addition(numberOne,numberTwo));
            }
            else if(calculationType.equals("float"))
            {
                double numberOne=input.nextDouble();
                double numberTwo=input.nextDouble();
                System.out.println(calculation.addition(numberOne,numberTwo));
            }
        }
        else {
            System.out.println("If ypu want int or float addition:");
            input.nextLine();
            String calculationType=input.nextLine();
            if(calculationType.equals("int"))
            {int numberOne=input.nextInt();
                int numberTwo=input.nextInt();
                System.out.println(calculation.subraction(numberOne,numberTwo));
            }
            else if(calculationType.equals("float"))
            {
                double numberOne=input.nextDouble();
                double numberTwo=input.nextDouble();
                System.out.println(calculation.subraction(numberOne,numberTwo));
            }
        }
    }
}
abstract  class Calculator
{
    public  int addition(int numberOne,int numberTwo)
    {
        return numberOne+numberTwo;
    }
    abstract  public double addition(double numberOne,double numberTwo);
    public  int subraction(int numberOne,int numberTwo)
    {
        return numberOne-numberTwo;
    }
    abstract public  double subraction(double numberOne,double numberTwo);
}
class FloatCalculator extends Calculator
{
    public  double addition(double numberOne,double numberTwo)
    {
        return numberOne+numberTwo;
    }
    public  double subraction(double numberOne,double numberTwo)
    {
        return numberOne-numberTwo;
    }
}