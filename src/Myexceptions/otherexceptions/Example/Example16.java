package Myexceptions.otherexceptions.Example;

public class Example16 {
    String str = "a";

    void A() {
        try {
            str += "b";
            B();
        } catch (Exception e) {
            str += "c";
        }
    }

    void B() throws Exception {
        try {
            str += "d";
            C();
        } catch (Exception e) {
            System.out.println("B exception catch"+e);
            throw new Exception();
        } finally {
            str += "e";
        }

        str += "f";

    }

    void C() throws Exception {
        throw new Exception();
    }

    void display() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Example16 object = new Example16();
        object.A();
        object.display();
    }

}
