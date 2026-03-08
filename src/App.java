import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;
public class App {
    public static void main(String[] args) throws Exception {
        int age = 9999;
        System.out.println(age);

        // primitave types 

        byte smallNom = 30; // -127 to + 127

        long viewCounts = 3_123_233; // this "_" seperates every 3 digits

        long viewCounts2 = 3_123_233_333L; // We must add "L" at the end in addition to declaring a long variable

        // float => small floating points and  double => large floating points
        
        double bigPurchase = 3342234.33;

        float smallPurchase = 33.33F; // we need to add the f as same as large numbers 

        // refrence type decleration 
        
        Date now = new Date();

        Point point1 = new Point(1,3);

        // strings (ref types in java)

        String message = " Hello world ";
        String message2 = " Hello world " + "!!";// concatinating
        boolean EndsWith = message2.endsWith("!!"); //bool returntype
        message.toLowerCase();
        message.trim();// delete White spaces before and after the string

        // Escape sequnces => use spetial chars and functions inside strings
        String message3 = "Hello \n \"sewalam\"";
        String message31 = "Hello \\";
        System.out.println(message31); 

        // Arrays

        int[] numbers = new int[5];
        numbers[0] = 3;

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

      //  multiDimentional arrays

      int[][] matrix = new int[2][3];

      matrix[0][0] = 1 ;

      System.out.println(Arrays.deepToString(matrix));

      // constaints 

      final float PI = 3.14F; // final** => you can't change it later  , Upercase naming 

      // arthematic exprestions (+ ,- ,/ , %)

      double result = (double)10 / (double)3 ;

      // casting 

      // Implicte casting => to bigger type to make the operation , no chance of data loss
      short x = 3; 
      int v = x + 2 ;

      // explicate casting 

      double q = 3.5 ;
      int y = (int)q + 3 ; // we will loss what after the floating point 

      // casting implicate and explicate can only happen between compatiple types
      
      // utility casting using wrapper classes 

      String cast = "1";

      int b = Integer.parseInt(cast) + 3 ;

      System.out.println(b);

      // Math class

      Math.round(1.1F);

      int x1 = (int)Math.ceil(1.1F); // we need implicate casting since we will convert types

      int k = (int)Math.random();

      // Formating numbers and method chaining

      String vv = NumberFormat.getPercentInstance() /*needed intermediate result for the next method*/.format(0.1);

      // Reading Input 
      Scanner scanner = new Scanner(System.in);
      System.out.println("Age: ");
      String name = scanner.nextLine().trim();
      System.out.println("You are "+ name);

    // mortgage calculator


    final byte MONTHS_IN_YEAR = 12;
    final byte  PERCENT = 4;

    
    System.out.println("principle");
    int principle = scanner.nextInt();

    System.out.println("Annual Interest Rate : ");
    int annualInterestRate  = scanner.nextInt();

    System.out.println("Period(Years) : ");
    byte years = scanner.nextByte();

    // Intermediate Calculation 


    // Formula Calculation 



    // -- Control Flow --

    // Comparison operators -- used with primitive variables 

    int x2 = 1 ;
    int y2 = 3 ;
    System.out.println( x2==y2 );// != , < , <= , ...
    //x==y => boolean expresion

    // Logical operators => && , || ,!

    // if statements


    // ternery operator 

    int income = 100_000; 
    String className = income > 100_000 ? "First" : "Economy"; // compare bet 2 options based on condition
                                                               //  there are alternatives rather than simple if 

    // switch
    int role = 2;
    switch (role){

      case 2: 
      System.out.println("you are an admin");
      break;  //very important 

      case 1: 
      System.out.println("you are an admin");
      break;  //very important 

      default:
        break;
    }

        // bizz fuz question

        // => we need to make the most specifec sol first, first you need to reach a sol then improve it 
        
        // for 

        for (int i = 1 ; i<=5 ; i++)
          System.out.println(i);
     




    



        


    }
}
