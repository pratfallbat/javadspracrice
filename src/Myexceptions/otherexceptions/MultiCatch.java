package Myexceptions.otherexceptions;
import java.util.Scanner;
public class MultiCatch {
    public static void main(String args[]) {
        try {
            int[] arr = new int[4];
            arr[5] = 8;
//            String s1 = "a";
//            Integer i = Integer.parseInt(s1);

            int a = 5 / 0;
            System.out.println(a);
           } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}
