import java.util.Scanner;
// Assumptions
// 1. Calculator takes Ints,Floats & Doubles as Inputs
// 2. Choosing outside of 1->8 will show you an error AFTER putting in num1 & num2

// Worked with the amazing Tabitha Mayabi!
public class calculator{
  //mod
  public static void mod(int a, int b){
    int resultMod;
    if(b>a){
      resultMod = b%a;
    }
    else{
      resultMod = a%b;
    }
    System.out.println("The mod of " + a + " & " + b + " is: " + resultMod);
  }
  //sqrt
  public static void squareRoot(float a){
   double resultSquareRoot = Math.sqrt(a);
    System.out.println("The square root of " + a + " is: " + resultSquareRoot);
  }
  //power
  public static void power(float a, float b){
    double resultPower = Math.pow(a,b);
    System.out.println("The result of " + a + "^" + b + " is: " + resultPower);
  }
  //average
  public static void average(int a, int b){
    double aveResult = add(a, b)/2;
    System.out.println("Average is: " + aveResult);
  }
  //add
  public static float add(float a, float b){
    float sum = a + b;
    System.out.println("Sum is: " + sum);
    return sum;
  }
  //subtract
  public static void subtract(float a, float b){
    float difference = a - b;
    System.out.println("Difference is: " + difference);
  }
  //multiply
  public static void multiply(float a, float b){
    double product = a * b;
    System.out.println("Product is: " + product);
  }
  //divide
  public static void divide(float a, float b){
    double division = a/b;
    System.out.println("Division is: " + division);
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int num1, num2;
    System.out.println("Welcome!\n What do you want to do?\n1.Add 2.Subtract\n3.Multiply  4.Divide\n5.Modulus 6.Average\n7.Squareroot 8.Power\n");
    int choice = Integer.parseInt(in.nextLine());
    if(!(choice<1|choice>8)){
    if(choice==7){
      System.out.println("Enter Number to Find Square Root Of...");
      num1 = Integer.parseInt(in.nextLine());
      squareRoot(num1);
    }
    else{
      System.out.println("Enter First Number...");
      num1 = Integer.parseInt(in.nextLine());
      System.out.println("Enter Second Number...");
      num2 = Integer.parseInt(in.nextLine());
      switch(choice){
        case 1: add(num1, num2); break;
        case 2: subtract(num1, num2); break;
        case 3: multiply(num1, num2); break;
        case 4: divide(num1, num2); break;
        case 5: mod(num1, num2); break;
        case 6: average(num1, num2); break;
        case 8: power(num1, num2); break;

        default: System.out.println("Please Enter Valid Choice (1->8)"); break;
      }
    }
    }
    else {
    System.out.println("Wrong Choice \n Please Select the Above Options!");
    }
//break label;
  }

}
