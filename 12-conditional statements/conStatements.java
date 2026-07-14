import java.util.*;

public class conStatements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your income : ");
        // int income = sc.nextInt();
        // int tax;

        // int a = 2;
        // int b = 3;
        // int c = 4;
        
        // if(a>b && a>c){
        //     System.out.println(a+" is greatest of three numbers.");
        // }
        // else if(b>c){
        //     System.out.println(b+" is greatest of three numbers.");
        // }
        
        // else{
        //     System.out.println(c+" is greatest of three numbers.");
        // }

        // Ternary operators

       /*  int number = 4;

        String typo = (number%2==0)? "even":"odd";
        System.out.println(typo);


        int age = 35;

        Boolean a = (age>18)?true:false;
        System.out.println(a);

        */

        // switch statement

      /*   int number = 10;

        switch(number){
            case 1 : System.out.println("Samosa");
                    break;

            case 2 : System.out.println("wadapav");
                    break;

            case 3 : System.out.println("idli");
                    break;

            default : System.out.println("water");
        }

        */

        //  calculator

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter operator : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+': System.out.println("(a+b)"+"="+(a+b));
                    break;
            case '-': System.out.println(a-b);
                    break;
            case '*': System.out.println(a*b);
                    break;
            case '/': System.out.println(a/b);
                    break;
            case '%': System.out.println(a%b);
                    break;
                
                
            default:System.out.println("Something went wrong");
        }



    }
}