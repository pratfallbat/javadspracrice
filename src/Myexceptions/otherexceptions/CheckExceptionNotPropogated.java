package Myexceptions.otherexceptions;
import java.io.IOException;
public class CheckExceptionNotPropogated {

    void m() {
        //here error is coming since its chcecked eception you have to catch it here
        //throw new IOException("device error");
    }


    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    public static void main(String args[]) {
        CheckExceptionNotPropogated obj = new CheckExceptionNotPropogated();
        obj.p();
        System.out.println("normal flow");
    }
}