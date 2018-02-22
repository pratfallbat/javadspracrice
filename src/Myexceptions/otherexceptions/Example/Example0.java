package Myexceptions.otherexceptions.Example;
public class Example0 {
    static{
        try
        {
            fun1();
            System.out.println("try");
        }
        finally
        {
            System.out.println( "Finally 1" );

        }
    }

    static void fun1(){
        System.out.println("fun1()");
    }

    public static void main(String[] args) {

    }

}
