public class func {

    public static boolean isPrime(int n){
        boolean isPrime = true;

        
        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPrime2(int n){

        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isPrime(2));

        System.out.println(isPrime2(4));
    }
}
