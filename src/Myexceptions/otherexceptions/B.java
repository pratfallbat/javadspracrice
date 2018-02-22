package Myexceptions.otherexceptions;

public class B {

    void z() throws Exception {
        throw new Exception();
    }

    void y() throws Exception {
        z();
        System.out.println("In Y");
    }

    void x() throws Exception {
        y();
        System.out.println("In X");
    }

    void w() throws Exception {
        x();
        System.out.println("In W");
    }

    public static void main(String[] args)  {
        B b = new B();
        try {
            b.w();
        } catch (Exception e) {
            System.out.println("errornow handled finally in main");
            e.printStackTrace();
        }
    }
}