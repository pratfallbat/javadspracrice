package Myexceptions.otherexceptions;

        import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        try {
            int x = 10 / s.nextInt();
            System.out.println(x);


            int[] arr = new int[5];
            arr[6] = 100;
            System.out.println("hello");
        } catch (ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException e) {
            System.out.println("Not important error go ahead");
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Exception");
        }finally{
            System.out.println("finally");
        }


        System.out.println("print this also");

    }

}
