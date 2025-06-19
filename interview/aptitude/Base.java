package interview.aptitude;

import java.io.EOFException;
import java.io.IOException;

public class Base {
    public static void main(String[] args) {
        // Qn 1
        // String x = "xyz";
        // x.toUpperCase();
        // String y = x.replace('Y', 'y');
        // y = y+"abc";
        // System.out.println(y);
        // Answer : xyzabc


        // Qn 2
        // A a = new B();
        // System.out.println("complete");
        // static class  A{
        //         public A(int x){}
        //     }
        // static class B extends A{}

        // Qn 3
        // int i = 1,j = 10;
        // do{
        //     if(i++>--j){
        //         continue;
        //     }
        // }while(i<5);
        // System.out.println("i = "+ i+"and j = "+j);
        // Answer : i = 5 and j = 6


        // Qn 4
        // ExamQn e = new ExamQn();
        // e.A(0);
        // System.out.println("j = "+e.j);
        // public static class ExamQn {
        //     static int j;
        //     static void A(int i){
        //         boolean b;
        //         do{
        //             b = i<10 |  B(4);
        //             b = i<10 || B(8);
        //         }while(!b);
        //     }
        //     static boolean B(int i){
        //         j+=i;
        //         return true;
        //     }
        // }
        // Answer : 4
        

        // Qn 6
        // String textString = new String("java");
        // StringBuffer textBuffer = new StringBuffer("java");
        // stringReplace(textString);
        // bufferReplace(textBuffer);
        // System.out.println(textString + textBuffer);
        // public static void stringReplace(String text){
        //     text = text.replace("j", "c");
        // }
        // public static void bufferReplace(StringBuffer text){
        //     text = text.append("c");
        // }
        // Answer : javajavac


        // Qn 6
        // Tree tree = new Pine();
        // if(tree instanceof Pine)
        //     System.out.print("Pine");
        // else if(tree instanceof Tree)
        //     System.out.print("Tree");
        // else if(tree instanceof Oak)
        //     System.out.print("Oak");
        // else
        //     System.out.print("Oops");
        // static class Tree {}
        // static class Pine extends Tree{}
        // static class Oak extends Tree{}
        // Answer : Pine


        // Qn 7
        // final StringBuffer a = new StringBuffer();
        // final StringBuffer b = new StringBuffer();

        // new Thread(){
        //     public void run(){
        //         System.out.print(a.append("A"));
        //         synchronized(b){
        //             System.out.print(b.append("B"));
        //         }
        //     }
        // }.start();
        // new Thread(){
        //     public void run(){
        //         System.out.print(b.append("C"));
        //         synchronized(a){
        //             System.out.print(a.append("D"));
        //         }
        //     }
        // }.start();
        // Answer : ACCBAD


        // Qn 8
        // App myApp = new App(10);
        // System.out.println(myApp.index);
        // static class Super{
        //     public int index;
        // }

        // static class App extends Super {
            
        //     public App(int index){
        //         index = index;
        //     }
            
        // }
        // Answer : 0


        // Qn 9
        // try{
        //     System.out.printf("1");
        //     int value = 10/0;
        //     throw new IOException();
        // }catch(EOFException e){
        //     System.out.printf("2");
        // }catch(ArithmeticException e){
        //     System.out.printf("3");
        // }catch(NullPointerException e){
        //     System.out.printf("4");
        // }catch(IOException e){
        //     System.out.printf("5");
        // }catch(Exception e){
        //     System.out.printf("6");
        // }
        // Answer : 13


        // Qn 10
        // C c = new C();
        // overl(c);
        // static void overl(A a){
        //      System.out.println("ONE");   
        // }
        // static void overl(B b){
        //      System.out.println("TWO");   
        // }
        // static void overl(Object obj){
        //      System.out.println("THREE");   
        // }
        // static class A{};
        // static class B extends A{};
        // static class C extends B{};
        // Answer : TWO


        // Qn 11
        // SubC s = new SubC();
        // s.meth(123321);
        // static class SupC{
        //      void meth(Number n){
        //         System.out.println("From Super Class");
        //     }
        // }
        // static class SubC extends SupC{
        //      void meth(Double d){
        //         System.out.println("From Sub Class");
        //     }
        // }
        // Answer : From Super Class


        // Qn 12
        // new A().A();
        // static class A{
        //     public A(int i){
        //         System.out.println("1");
        //     }
        //     public A(){
        //         this(10);
        //         System.out.println("2");
        //     }
        //     void A(){
        //         A(10);
        //         System.out.println("3");
        //     }
        //     void A(int i){
        //         System.out.println("4");
        //     }
        // }
        // Answer : 1243


        // Qn 13
        // Test obj = new Test();
        // obj.set(20);
        // obj.get();

        // abstract class demo{
        //     public int a;
        //     demo(){
        //         a = 10;
        //     }

        //     abstract public void set();
        //     abstract final public void get();
        // }

        // static class Test extends demo{

        //     public void set(int a){
        //         this.a = a;
        //     }
        //     final public void get(){
        //         System.out.println("a = "+a);
        //     }
        // }
        // Answer : Compilation error


        // Qn 15
        // Test t = new Test();
        // static class Test{
        //     public Test(){
        //         System.out.printf("1");
        //         new Test(10);
        //         System.out.println("5");
        //     }
        //     public Test(int temp){
        //         System.out.printf("2");
        //         new Test(10,20);
        //         System.out.printf("4");
        //     }
        //     public Test(int data, int temp){
        //         System.out.printf("3");
        //     }
        // }
        // Answer :  12345

    }

    
}
