public class palindrome {
    static String rev = "";
    public static void Reverse(String str){
        if(str == null || str.length()<= 1){
            rev += str;
        }else{
            rev += str.charAt(str.length()-1);
            Reverse(str.substring(0, str.length()-1));
        }
       
    }
    public static void main(String[] args) {
        String str = "madam";
        Reverse(str);
        System.out.println(rev.equals(str));
    }
}
