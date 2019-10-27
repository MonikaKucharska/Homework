public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 2 ; i<num; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime (int n){
        boolean isPrime = true;
        for (int i = 2; i<n; i++){
            if(n % i==0){
                isPrime = false;
                break;
            }
            isPrime = true;
        }
        return isPrime;
    }
}
