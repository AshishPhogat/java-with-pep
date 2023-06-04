import java.util.Scanner;

public class Datatype {

    //don't work -no-pointers -no-pass-by-refernce
    public static void fun(){
        int temp =a;
        a = b;
        b = temp;
        return;
    }
    static int a ;
    static int b ;
    public static void main(String [] args){
//        all signed :
//        byte 1
//        short 2
//        int 4
//        long 8
//        char 2
//        float 4
//        double 8
//        boolean
        a = 10;
        b = 20;

        System.out.println(a);
        System.out.println(b);
        fun();
        System.out.println(a);
        System.out.println(b);

    }
}
