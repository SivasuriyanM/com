package interview;
// Time Complexity: O(1)
// Space Complexity: O(1)
import java.util.Scanner;

class ComplexNumber{
    int real, img;

    ComplexNumber(int real , int img){
        this.real = real;
        this.img = img;
    }

    ComplexNumber multiply(ComplexNumber other){
        int realPart = this.real*other.real - this.img*other.img;
        int imgPart = this.real*other.img + this.img*other.real;
        return new ComplexNumber(realPart, imgPart);
    }

    @Override
    public String toString(){
        String sign = (img>=0)?"+":"";
        return real + sign + img + "i";
    }
}

public class ComplexMultiplication {


    public static ComplexNumber parseComplex(String s){
        s = s.replace("i","");
        String[] parts;
        int real = 0; 
        int img = 0;


        if(s.contains("+")){
            parts = s.split("\\+");
            real = Integer.parseInt(parts[0]);
            img = Integer.parseInt(parts[1]);
        }else{
            parts = s.split("-");
            real = Integer.parseInt(parts[0]);
            img = -Integer.parseInt(parts[1]);
        }
        return new ComplexNumber(real, img);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 1st Complex Number : ");
        String c1Input = scanner.nextLine();

        System.out.print("Enter 2st Complex Number : ");
        String c2Input = scanner.nextLine();

        ComplexNumber c1 = parseComplex(c1Input);
        ComplexNumber c2 = parseComplex(c2Input);

        ComplexNumber result = c1.multiply(c2);

        System.out.println("After Multiplication : "+ result);
    }
    
}
