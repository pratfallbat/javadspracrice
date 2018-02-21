package Map;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;
public class Maptwo {
    public static void main(String[] args) {
     //Map has a keyset method
        //iteration on the keysey may shw keys in any order

        Map<String,int[]> m =new HashMap<String, int[]>();
    Set<String> ks = m.keySet();
    m.put("Fig",new int[]{1,2,3,4});
//ks.remove("Dig");
        System.out.println(m.get("Fig"));
        TreeMap<String,int[]> tm =new TreeMap<String, int[]>();
Set<String> os=tm.navigableKeySet();
        tm.put("Dig",new int[]{1,2,3,4});
        tm.put("Aig",new int[]{1,2,3,4});
        tm.put("Big",new int[]{1,2,3,4,5});
        Set<String> tks = tm.navigableKeySet();
tks.remove("Aig");
        System.out.println(m);
        System.out.println(tm);

    }
    //Treemap class has a navigableKeySet method which gives key in order
}
