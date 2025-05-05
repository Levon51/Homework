package specifires;
class Prime{
    static final int prime = 7919;
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int nextPrime (int n){
        int next = n + 1;
        while(true){
            if(isPrime(next)){
                return next;
            }
            next ++;
        }
    }
}
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Next prime number is " + Prime.nextPrime(Prime.prime));
    }
}
