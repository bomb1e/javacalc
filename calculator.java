import java.util.Scanner;
// Assumptions
// 1. Calculator takes Ints,Floats & Doubles as Inputs

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
    double num;
    double resultSquareRoot = a / 2;

    do{
      num = resultSquareRoot; //
      resultSquareRoot = (num + (a / num)) / 2;
    }
    while ((num - resultSquareRoot) != 0);
    
    System.out.println("The square root of " + a + " is: " + resultSquareRoot);
  }
  //power
  public static void power(float a, float b){
    double resultPower = a;
    for(int i=1;i<b;i++){
        resultPower*=a;
    }
    System.out.println("The result of " + a + "^" + b + " is: " + resultPower);
  }
  //average
  public static void average(int a, int b){
    float aveResult = (float)a + ((float)b-(float)a)/2;
    System.out.println("Average is: " + aveResult);
  }
  //add
  public static void add(float a, float b){
    float sum = a + b;
    System.out.println("Sum is: " + sum);
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
    try{
      double division = a/b;
      System.out.println("Division is: " + division);
    }
    catch(ArithmeticException e){
      System.out.println("Please don't divide by zero");
    }
    
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
    else{
    System.out.println("Wrong Choice \n Please Select the Above Options!");
    }
  }
}
