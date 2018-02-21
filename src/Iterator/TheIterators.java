package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TheIterators {
    public static void main(String[] args) {
        System.out.println("The list have a method called  iterator that returns iterator<Integer>");
        System.out.println("How: Thelist interface extends the iterable interface inheriting iterator abstract methode");
        System.out.println("public interface Iterable<T>{Iterator<T> iterator();}");

        System.out.println("public interface List<T> extends Iterable<T>");
        System.out.println("interface Iterator<T>{boolean hasNext(); T next();}");
        List<Integer>  a= new ArrayList<Integer>();
        a.add(5);
        a.add(15);
        a.add(25);
        for(int x:a){
            System.out.println(x);
        }
        Iterator<Integer> seer=  a.iterator();
        while (seer.hasNext()){
            System.out.println(seer.next());
          }
    }
}
