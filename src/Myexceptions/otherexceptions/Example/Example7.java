package Myexceptions.otherexceptions.Example;

public class Example7 {

    public static void main(String[] args) {
        try {
            badMethod();
            System.out.print("C");
        } catch (Exception ex) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public static void badMethod() {
    }
}