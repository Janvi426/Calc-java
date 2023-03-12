import java.util.*;
public class calc {
   public static void main(String...arg){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter value1 = ");
      int value1 = sc.nextInt();
      System.out.print("Enter value2 = ");
      int value2 = sc.nextInt();
      System.out.print("Enter operator = ");
      String operator = sc.next();
      switch(operator){
        case "+" : System.out.print(value1+value2);
                   break;
        case "-" : System.out.print(value1-value2); 
                   break;
        case "*" : System.out.print(value1*value2); 
                   break; 
        case "/" : System.out.print(value1/value2); 
                   break;                             
        case "%" : System.out.print(value1%value2); 
                   break;
        default : System.out.println("Invalid");
                }
        // also i can write like this
        // char operator = sc.next().charAt(0); ( to make string = char)
        // and case like ... case '+' : ....

    } 
}
