import java.util.*;

public class primeORnot{
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);


    // code for prime number

  /*   System.out.print("Enter number : ");
    int n = sc.nextInt();

    boolean isPrime = true;

    if(n<=1){
        System.out.println(n+" is not prime");
    }
    else{
    for(int i = 2; i<=n-1; i++){
        if(n%i==0){
            isPrime = false;
        }
    }

    if(isPrime==true){
        System.out.print(n+" is prime number.");
    }
    else{
        System.out.print(n+" is not prime number.");
    }
}              */
                


    // Optimised code for Prime no.

    System.out.print("Enter number : ");
    int n = sc.nextInt();
    boolean isPrime = true;

    if(n<=1){
        System.out.println(n+" is not Prime");
    }
    else{

    for(int i = 2; i<=Math.sqrt(n); i++){
        if(n%i==0){
            isPrime = false;
        }
    }

    if(isPrime==true){
        System.out.print(n+" is prime number.");
    }
    else{
        System.out.print(n+" is not prime number.");
    }
    }

    }
}