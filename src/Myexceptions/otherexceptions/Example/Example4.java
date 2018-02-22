package Myexceptions.otherexceptions.Example;

//public class Example4 {
//}

public class Example4 {

    public static void main(String[] args) {
        try {
            badMethod();
            System.out.print("A");
        }
        catch (Error ex) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public static void badMethod() {
        throw new Error();
    }
}