import java.util.*;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i= 1; i<5;i++){
            // System.out.println("****");

        }
           // print reverse of number
          
        int n = 28062005;

        while(n>0){
            int lastdigit = n%10;
            // System.out.print(lastdigit);
            n = n/10;
        }

        // reverse the given number

        int a = 28062005;
        int rev = 0;

        while(a>0){
            int lastdig = a%10;
            rev = (rev*10) + lastdig;
            a = a/10;
        }
        // System.out.println(rev);


        // break statement
        
      /*   do { 
            System.out.print("Enter your number : ");
            int b = sc.nextInt();

            if(b%10==0){
                System.out.println("You entered "+b+ "  which is multiple of 10. ");
                break;
            }
            System.out.println(b);

        } while (true);          */


        // contoiue staement

        for(int c = 1; c<=100; c++){
            if(c%10 == 0){
                continue;
            }
            System.out.println(c);
        }


    }
}
