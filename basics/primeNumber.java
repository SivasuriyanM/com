public class primeNumber {
    public static boolean isPrime(int num){
        if(num <= 4) return num == 3?true: false;
        int sqrt = (int)Math.sqrt(num);
        for(int i = 2; i<sqrt; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
    
}
