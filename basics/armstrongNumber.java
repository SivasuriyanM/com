public class armstrongNumber {
    public static boolean check(int num){
        int sum = 0, temp = num;
        while (temp!=0) {
            int digit = temp%10;
            sum+= digit*digit*digit;
            temp = temp/10;
        }
        return sum == num ? true: false;
    }
    public static void main(String[] args) {
        System.out.println(check(123));
    }
}
