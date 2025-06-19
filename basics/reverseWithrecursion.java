// Reverse a String
public class reverseWithrecursion {
    public static void Reverse(String str){
        if(str == null || str.length()<= 1){
            System.out.print(str);
        }else{
            System.out.print(str.charAt(str.length()-1));
            Reverse(str.substring(0, str.length()-1));
        }
       
    }
    public static void main(String[] args) {
        Reverse("String reverve using recursion");
    }

}
