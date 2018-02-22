package Myexceptions.otherexceptions.Example;

//public class Example2 {
//}

public class Example2 {

    public static void aMethod() {
        try {
            throw new RuntimeException();
        }
        finally {
            System.out.println("finally ");
        }
    }
    public static void main(String args[]) {
        try {
            aMethod();
        }
        catch (Exception e) {
            System.out.println("exception ");
            System.out.println(e);
            throw new RuntimeException();
        } finally{
            System.out.print("finished ");
        }

    }
}