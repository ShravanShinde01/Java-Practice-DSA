import java.util.*;

public class eSumoSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1; i<=n; i++){
            if(i%2==0){
                evenSum = evenSum + i;
                
            }
            else{
                oddSum = oddSum + i;
                
            }
        }
        System.out.println("Sum of even numbers are "+evenSum);
        System.out.println("Sum of odd numbers are "+oddSum);

    }
}
