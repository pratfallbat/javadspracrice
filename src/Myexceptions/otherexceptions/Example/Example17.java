package Myexceptions.otherexceptions.Example;
public class Example17 {
    int count = 0;

    void A() throws Exception {
        try {
            count++;
                        try {
                            count++;
                                    try {
                                        count++;
                                        throw new Exception();
                                       }
                                    catch (Exception ex) {
                                        count++;
                                        throw new Exception();
                                    }
                            }
                        catch (Exception ex) {
                            count++;
                            }
        }
        catch (Exception ex) {
            count++;
        }
    }

    void display() {
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception {
        Example17 obj = new Example17();
        obj.A();
        obj.display();
    }
}
