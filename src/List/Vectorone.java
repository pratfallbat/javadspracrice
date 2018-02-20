package List;
import java.util.Vector;

public class Vectorone {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();

        vector.add("element1");
        vector.add("element2");
        vector.add("element3");
        System.out.println(vector);

        vector.remove("element1");
        System.out.println(vector);

    }
}
