package Myexceptions.otherexceptions.Example;

class Exc0 extends Exception {
}

class Exc1 extends Exc0 {
}

public class Example10 {
    public static void main(String args[]) {
        try {
            throw new Exc1();


        } catch (Exc0 e0) {
            System.out.println("Ex0 caught");
            System.out.println(e0);
        } catch (Exception e) {
            System.out.println("exception caught");
        }




    }
}