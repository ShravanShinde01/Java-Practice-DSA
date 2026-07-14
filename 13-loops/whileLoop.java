import java.util.*;

public class whileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n till you want count :  ");
        int n = sc. nextInt();
        int a = 1;
        int sum = 0;


        while(a<=n){
            System.out.print(a+" ");
            sum = sum + a; 
            a++;
        }
        System.out.println();
        System.out.println("Total sum is : "+sum);
    }
}
